package com.cuizb.spring.event.design.listener;

import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.cuizb.spring.event.design.event.ChangeLogEvent;
import com.cuizb.spring.event.model.dto.SdAiChangeLogDto;
import com.cuizb.spring.event.model.entity.SdAiGroup;
import com.cuizb.spring.event.service.SdAiGroupService;
import com.zaxxer.hikari.util.UtilityElf;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 面向接口方式: AbstractEventListener<E extends AbstractEvent>  E事件单独的监听器
 * @author cuizongbao
 * @date 2023-02-14 18:37
 * Be in awe of every code modification
 */
@Slf4j
@Component
public class ChangeLogListener implements AbstractEventListener<ChangeLogEvent> {

    @Autowired
    private SdAiGroupService sdAiGroupService;


    @Override
    public void addCallback(SynchronizationCallback callback) {
        log.error("addCallback -----");
    }

    @Override
    public void processEvent(ChangeLogEvent event) {
        log.error("processEvent ---- " + event.getChangeLog());
    }

    @Override
    public void onApplicationEvent(ChangeLogEvent event) {
        log.info("onApplicationEvent测试: {}", event);
        EXECUTOR.execute(() -> {
            try {
                DynamicDataSourceContextHolder.push("sd");
                String index = Thread.currentThread().toString();
                SdAiChangeLogDto source = event.getChangeLog();
                log.error(index + ">>> event info : " + source);
                SdAiGroup byId = sdAiGroupService.getById(source.getSourceId());
                log.error(index + ">>> event select " + byId);
                log.error(index + ">>> database====>" + byId.getStatus());
            } catch (Exception e) {
                log.error("" + e);
            } finally {
                DynamicDataSourceContextHolder.poll();
            }
        });
    }
    private static final Executor EXECUTOR = new ThreadPoolExecutor(4, 4, 120L, TimeUnit.SECONDS, new LinkedBlockingQueue<>(), new UtilityElf.DefaultThreadFactory("cuizb-thread-name_", true), new ThreadPoolExecutor.AbortPolicy());
}
