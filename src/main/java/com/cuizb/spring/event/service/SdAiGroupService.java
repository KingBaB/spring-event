package com.cuizb.spring.event.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cuizb.spring.event.model.entity.SdAiGroup;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * ai托管组表 service层
 *
 * @author zane
 * @since 2023-01-11 14:45:56
 */
public interface SdAiGroupService extends IService<SdAiGroup> {
}
