package com.cuizb.spring.event.model.enums;

/**
 * @author cuizongbao
 * @date 2023-02-28 5:11 下午
 * Be in awe of every code modification
 */
public enum AiActionTypeEnum {

    /**
     * 智能优化相关
     */
    single_ai_setting_update(1, AiTypeEnum.ai,"单个智能优化设置页面"),
    rule_template_setting_update(2, AiTypeEnum.ai,"智能优化规则模板修改"),
    rule_template_bind_campaign(3, AiTypeEnum.ai,"规则绑定广告活动"),
    rule_template_unbind_campaign(4, AiTypeEnum.ai,"规则解绑广告活动"),
    single_ai_setting_status_update(5, AiTypeEnum.ai,"广告活动状态变更关闭ai状态"),
    system_close_profile_ai(6, AiTypeEnum.ai,"系统关停店铺ai或预算优化状态"),
    /**
     * 托管组相关
     */
    smart_creation_ai_group(7, AiTypeEnum.aiGroup, "智能创建生成的ai托管组"),
    ai_group_setting_update(8, AiTypeEnum.aiGroup, "ai托管组设置变更"),
    ai_group_merge(9, AiTypeEnum.aiGroup, "ai托管组合并"),
    ai_group_add_campaign(10, AiTypeEnum.aiGroup, "ai托管组添加广告活动"),
    ai_group_del_campaign(11, AiTypeEnum.aiGroup, "ai托管组移除广告活动"),
    ai_group_add_asin(12, AiTypeEnum.aiGroup, "ai托管组添加asin"),
    ai_group_create(13, AiTypeEnum.aiGroup, "创建ai托管组"),
    ai_group_no_enabled_campaign_setting_status_update(14, AiTypeEnum.aiGroup, "托管组中无启用的广告活动取消托管组"),
    ;

    private Integer type;
    private AiTypeEnum aiType;
    private String desc;
    AiActionTypeEnum(Integer type, AiTypeEnum aiType, String desc) {
        this.type = type;
        this.aiType = aiType;
        this.desc = desc;
    }

    public Integer getType() {
        return type;
    }

    public AiTypeEnum getAiType() {
        return aiType;
    }

    public String getDesc() {
        return desc;
    }
}
