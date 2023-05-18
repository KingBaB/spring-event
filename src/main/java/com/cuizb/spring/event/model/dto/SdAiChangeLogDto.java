package com.cuizb.spring.event.model.dto;

import com.cuizb.spring.event.model.enums.ActionSourceTypeEnum;
import com.cuizb.spring.event.model.enums.AiActionTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @author cuizongbao
 * @date 2023-02-15 16:40
 * Be in awe of every code modification
 * @apiNote
 * 第一种情况: 状态关闭时
 *      除必要字段外, 只需要设置status的新旧值即可
 * 第二种情况: 修改除关闭外时的设置
 *      所有字段必须设置
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SdAiChangeLogDto {
    private Long profileId;
    /**
     * rule template id 或者 ai group id
     */
    private Long sourceId;

    private AiActionTypeEnum actionType;
    /**
     * 影响到的campaign ids
     */
    private List<Long> campaignIds;
    /**
     * 更改前的数据
     */
    private SdAiChangeDetailLogDto preChangeLog;
    /**
     * 更改后的数据
     */
    private SdAiChangeDetailLogDto newChangeLog;
    /**
     * 备注
     */
    private String remark;
    /**
     * 被合并的托管组和广告活动关系
     */
    private Map<Long, List<Long>> mergeAiGroupIdMap;
    /**
     * 触发此操作的来源 1-平台 2-系统关停 3-广告活动状态变更 4-定时任务 5-亚马逊同步
     * 默认是平台
     */
    private ActionSourceTypeEnum actionSourceType;
}
