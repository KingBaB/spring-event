/*
 * Copyright (C) 1997-2020 康成投资（中国）有限公司
 *
 * http://www.rt-mart.com
 *
 * 版权归本公司所有，不得私自使用、拷贝、修改、删除，否则视为侵权
 *
 */

package com.cuizb.spring.event.design.listener;

import com.cuizb.spring.event.design.event.AbstractEvent;
import org.springframework.transaction.event.TransactionalApplicationListener;

/**
 * 异步事件监听抽象父类
 *
 * @author dexu.tian
 * @date 2021/2/5
 */
public interface AbstractEventListener<E extends AbstractEvent> extends TransactionalApplicationListener<E> {

}
