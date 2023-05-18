package com.cuizb.spring.event.controller;

import com.baomidou.dynamic.datasource.annotation.DSTransactional;
import com.cuizb.spring.event.biz.TestBizService;
import com.cuizb.spring.event.design.EventPublisher;
import com.cuizb.spring.event.design.event.ChangeLogEvent;
import com.cuizb.spring.event.design.event.TestEvent;
import com.cuizb.spring.event.model.dto.DtoAssembler;
import com.cuizb.spring.event.model.dto.SdAiChangeDetailLogDto;
import com.cuizb.spring.event.model.dto.SdAiChangeLogDto;
import com.cuizb.spring.event.model.entity.SdAiGroup;
import com.cuizb.spring.event.service.SdAiGroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author cuizongbao
 * @date 2023-05-17 10:44 上午
 * Be in awe of every code modification
 */
@Slf4j
@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private SdAiGroupService sdAiGroupService;

    @Autowired
    private TestBizService testBizService;

    @Autowired
    @Qualifier("commonThreadPoolTaskExecutor")
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @GetMapping("/test")
    public String test() throws InterruptedException {
        return testBizService.test();
    }

}
