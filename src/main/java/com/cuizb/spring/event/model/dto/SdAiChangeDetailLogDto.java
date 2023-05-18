package com.cuizb.spring.event.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author cuizongbao
 * @date 2023-02-15 16:40
 * Be in awe of every code modification
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SdAiChangeDetailLogDto {
    private Double acos;
    /**
     * 状态 0-关闭/未开启 1-开启/托管中 2-已取消
     */
    private Integer status;
    /**
     * 托管组名称
     */
    private String aiGroupName;
    /**
     * 1和2
     */
    private Integer optimizeType;
    /**
     * 预算动态优化状态 0-关闭 1-开启
     */
    private Integer budgetDynamicStatus;
    /**
     * 开启预算动态优化时的数值类型 1-百分比 2-固定值
     */
    private Integer numType;
    /**
     * 开启预算动态优化时的数值
     */
    private Double num;
    /**
     * 是否开启广告活动名称标记 0-关闭 1-开启
     */
    private Integer campaignNameSign;
    /**
     * 保留或恢复广告活动名称 1-保留 2-恢复
     */
    private Integer campaignNameRecoveryType;
    /**
     * 变化的campaignIds
     */
    private List<Long> campaignIds;
    /**
     * 竞价优化状态
     */
    private int bidStatus;
    /**
     * 定向优化状态
     */
    private int targetedStatus;
    /**
     * 预算优化状态
     */
    private int budgetStatus;
    /**
     * 定向收割 0-关闭 1-开启
     */
    private Integer targetHarvestStatus;
}
