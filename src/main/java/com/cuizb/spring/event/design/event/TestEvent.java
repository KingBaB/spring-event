package com.cuizb.spring.event.design.event;

import lombok.Getter;

/**
 * @author cuizongbao
 * @date 2023-05-17 2:13 下午
 * Be in awe of every code modification
 */
@Getter
public class TestEvent  extends AbstractEvent{
    private Integer test;
    public TestEvent(Object source, Integer test) {
        super(source);
        this.test = test;
    }
}
