package com.cuizb.spring.event.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cuizb.spring.event.mapper.SdAiGroupMapper;
import com.cuizb.spring.event.model.entity.SdAiGroup;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

import static java.math.RoundingMode.HALF_UP;
import static java.util.Objects.isNull;


/**
 * ai托管组表 service实现层
 *
 * @author zane
 * @since 2023-01-11 14:45:56
 */

@Service("sdAiGroupService")
@Slf4j
@DS("sd")
public class SdAiGroupServiceImpl extends ServiceImpl<SdAiGroupMapper, SdAiGroup> implements SdAiGroupService {}
