package com.cuizb.spring.event.biz;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.dynamic.datasource.annotation.DSTransactional;
import com.cuizb.spring.event.design.EventPublisher;
import com.cuizb.spring.event.design.event.AbstractEvent;
import com.cuizb.spring.event.design.event.ChangeLogEvent;
import com.cuizb.spring.event.design.event.TestEvent;
import com.cuizb.spring.event.model.dto.DtoAssembler;
import com.cuizb.spring.event.model.dto.SdAiChangeDetailLogDto;
import com.cuizb.spring.event.model.dto.SdAiChangeLogDto;
import com.cuizb.spring.event.model.entity.SdAiGroup;
import com.cuizb.spring.event.service.SdAiGroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

/**
 * @author cuizongbao
 * @date 2023-05-17 3:15 下午
 * Be in awe of every code modification
 */
@Slf4j
@Service
public class TestBizService {
    @Autowired
    private SdAiGroupService sdAiGroupService;

    @Autowired
    private EventPublisher eventPublisher;

    @Autowired
    private TestBizService testBizService;

    @DSTransactional
    public String test() {
        log.error("{}", Thread.currentThread());
        int i = new Random(100).nextInt();
        int i1 = new Random(100).nextInt();
        String name = "tttt" + i * i1;
        SdAiGroup aiGroup = SdAiGroup.builder()
                .status((byte) 1)
                .acos(0.1)
                .budgetDynamicStatus((byte) 0)
                .campaignNameSign((byte) 0)
                .createBy(1)
                .updateBy(1)
                .createTime(System.currentTimeMillis())
                .updateTime(System.currentTimeMillis())
                .deleted((byte) 0)
                .intention("wu")
                .optimizeType(1)
                .profileId(113434409578602L)
                .smartCreationName(name)
                .build();
        sdAiGroupService.save(aiGroup);
        SdAiChangeDetailLogDto sdAiChangeDetailLogDto = DtoAssembler.INSTANCE.toAiChangeDetailLogDtoByAiGroup(aiGroup);
        SdAiChangeLogDto build = SdAiChangeLogDto.builder()
                .sourceId(aiGroup.getId())
                .preChangeLog(sdAiChangeDetailLogDto)
                .build();
        testBizService.publishEvent(new ChangeLogEvent(this, build));

        SdAiGroup byId = sdAiGroupService.getById(aiGroup.getId());
        byId.setStatus((byte) 0);
        sdAiGroupService.updateById(byId);
        SdAiChangeDetailLogDto newSdAiChangeDetailLogDto = DtoAssembler.INSTANCE.toAiChangeDetailLogDtoByAiGroup(byId);
        build.setNewChangeLog(newSdAiChangeDetailLogDto);
        testBizService.publishEvent(new ChangeLogEvent(this, build));
        testBizService.publishEvent(new TestEvent(this, 1));
        return aiGroup.getId() + " ---- " + name;
    }

    @Transactional(rollbackFor = Exception.class)
    public void publishEvent(AbstractEvent o) {
        eventPublisher.publishEvent(o);
    }
}
