package com.cuizb.spring.event.model.enums;

/**
 * @author Zane Cui
 * @date 2022-12-20 15:28
 * Be in awe of every code modification
 */
public enum AiTypeEnum {
    /**
     * 1-智能优化 2-ai托管
     */
    ai(1),
    aiGroup(2),
    ;
    private Integer type;
    AiTypeEnum(Integer type){
        this.type = type;
    }

    public Integer getType() {
        return type;
    }
}
