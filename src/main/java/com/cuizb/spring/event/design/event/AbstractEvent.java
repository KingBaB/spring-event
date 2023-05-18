/*
 * Copyright (C) 1997-2020 康成投资（中国）有限公司
 *
 * http://www.rt-mart.com
 *
 * 版权归本公司所有，不得私自使用、拷贝、修改、删除，否则视为侵权
 *
 */

package com.cuizb.spring.event.design.event;

import org.springframework.context.ApplicationEvent;

/**
 * 抽象异步事件对象
 *
 * @author dexu.tian
 * @date 2021/2/5
 */
public abstract class AbstractEvent extends ApplicationEvent {

    public AbstractEvent(Object source) {
        super(source);
    }
}
