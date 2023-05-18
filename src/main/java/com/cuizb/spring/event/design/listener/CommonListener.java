package com.cuizb.spring.event.design.listener;

import com.cuizb.spring.event.design.event.ChangeLogEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * 面向注解方式: 通用监听器,使用注解监听事件来源,相对比较灵活
 * @author cuizongbao
 * @date 2023-05-18 10:17 上午
 * Be in awe of every code modification
 */
@Slf4j
@Component
public class CommonListener {

    /**
     * 监听ChangeLogEvent的事件,并且在只会监听有事务的事件, 会在事务提交后的执行
     * @param event event
     */
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT, value = ChangeLogEvent.class)
    public void commonTransactionalEventListener(ChangeLogEvent event) {
        log.info("commonTransactionalEventListener测试: {}", event);
    }

    /**
     * 监听所有事件
     * @param event event
     */
    @EventListener
    public void commonEventListener(Object event) {
        log.info("commonEventListener测试: {}", event);
    }


}
