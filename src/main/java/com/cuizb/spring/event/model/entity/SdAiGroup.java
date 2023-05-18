package com.cuizb.spring.event.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ai托管组表 实体
 *
 * @author zane
 * @since 2023-01-11 14:45:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("sd_ai_group")
public class SdAiGroup extends Model<SdAiGroup> {
    /**
     * 目标acos
     */
	@TableField("acos")
	private Double acos;

    /**
     * 预算动态优化状态 0-关闭 1-开启
     */
	@TableField("budget_dynamic_status")
	private Byte budgetDynamicStatus;

    /**
     * 是否开启广告活动名称标记 0-关闭 1-开启
     */
	@TableField("campaign_name_sign")
	private Byte campaignNameSign;

    /**
     * 0：未删除，1： 已删除
     */
	@TableField("deleted")
	@TableLogic
	private Byte deleted;

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
	@TableField("id")
	private Long id;

    /**
     * 意图,多个逗号分隔
     */
	@TableField("intention")
	private String intention;

    /**
     * 开启预算动态优化时的数值
     */
	@TableField("num")
	private Double num;

    /**
     * 开启预算动态优化时的数值类型 1-百分比 2-固定值
     */
	@TableField("num_type")
	private Integer numType;

    /**
     * 店铺id
     */
	@TableField("profile_id")
	private Long profileId;

    /**
     * 订单目标 1-推动增长 2-保持稳定
     */
	@TableField("optimize_type")
	private Integer optimizeType;

    /**
     * 智能创建活动标识
     */
	@TableField("smart_creation_name")
	private String smartCreationName;

    /**
     * ai托管状态0-关闭 1-开启 2-取消
     */
	@TableField("status")
	private Byte status;

    /**
     * 1：v1版本 2：v2版本
     */
    @TableField("version")
	private Integer version;

	/**
	 * 创建人
	 */
	@TableField(value = "create_by", fill = FieldFill.INSERT)
	private Integer createBy;

	/**
	 * 创建时间
	 */
	@TableField(value = "create_time", fill = FieldFill.INSERT)
	private Long createTime;

	/**
	 * 更新人
	 */
	@TableField(value = "update_by", fill = FieldFill.INSERT_UPDATE)
	private Integer updateBy;

	/**
	 * 更新时间
	 */
	@TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
	private Long updateTime;


}
