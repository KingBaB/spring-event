package com.cuizb.spring.event.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cuizb.spring.event.model.entity.SdAiGroup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ai托管组表 dao层
 *
 * @author zane
 * @since 2023-01-11 14:45:56
 */
public interface SdAiGroupMapper extends BaseMapper<SdAiGroup> {

}
