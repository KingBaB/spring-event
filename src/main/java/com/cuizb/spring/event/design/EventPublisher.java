/*
 * Copyright (C) 1997-2020 康成投资（中国）有限公司
 *
 * http://www.rt-mart.com
 *
 * 版权归本公司所有，不得私自使用、拷贝、修改、删除，否则视为侵权
 *
 */

package com.cuizb.spring.event.design;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 异步事件发送
 *
 * @author dexu.tian
 * @date 2021/2/5
 */
@Service
public class EventPublisher {

    @Autowired
    private ApplicationContext applicationContext;

    /**
     * 发送异步事件
     *
     * @param event e
     */
    public void publishEvent(ApplicationEvent event) {
        applicationContext.publishEvent(event);
    }

}
