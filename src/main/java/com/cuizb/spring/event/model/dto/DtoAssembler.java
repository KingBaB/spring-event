package com.cuizb.spring.event.model.dto;

import com.cuizb.spring.event.model.entity.SdAiGroup;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author yongqing
 * @className DtoAssembler
 * @description TODO
 * @date 2022/1/14 4:35 下午
 */
@Mapper
public interface DtoAssembler {
    DtoAssembler INSTANCE = Mappers.getMapper(DtoAssembler.class);

    @Mappings({
            @Mapping(target = "aiGroupName",source = "smartCreationName")
    })
    SdAiChangeDetailLogDto toAiChangeDetailLogDtoByAiGroup(SdAiGroup sdAiGroup);
}
