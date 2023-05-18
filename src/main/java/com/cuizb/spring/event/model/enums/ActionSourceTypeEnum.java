package com.cuizb.spring.event.model.enums;

import java.util.Objects;

/**
 * @author cuizongbao
 * @date 2023-05-10 11:15 上午
 * Be in awe of every code modification
 */
public enum ActionSourceTypeEnum {
    /**
     * 1-平台 2-系统关停 3-广告活动状态变更 4-定时任务 5-亚马逊同步
     */
    PLATE_FORM(1, "平台"),
    SYSTEM_PAUSE(2, "系统关停"),
    PLATE_FORM_CAMPAIGN_STATUS_CHANGE(3, "广告活动状态变更"),
    JOB_OPERATION(4, "定时任务"),
    AMAZON_SYNC_CAMPAIGN_STATUS(5, "亚马逊同步"),
    ;

    private Integer type;
    private String desc;
    ActionSourceTypeEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public Integer getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public static ActionSourceTypeEnum getEnumByType(Integer type) {
        if (Objects.isNull(type) || type == 1) {
            return ActionSourceTypeEnum.PLATE_FORM;
        }
        for (ActionSourceTypeEnum value : ActionSourceTypeEnum.values()) {
            if (value.type.equals(type)) {
                return value;
            }
        }
        return ActionSourceTypeEnum.PLATE_FORM;
    }
}
