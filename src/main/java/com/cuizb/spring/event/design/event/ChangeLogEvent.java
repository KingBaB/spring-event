package com.cuizb.spring.event.design.event;


import com.cuizb.spring.event.model.dto.SdAiChangeLogDto;
import lombok.Getter;

/**
 * @author cuizongbao
 * @date 2023-02-14 18:34
 * Be in awe of every code modification
 */
@Getter
public class ChangeLogEvent extends AbstractEvent {

    private final SdAiChangeLogDto changeLog;
    public ChangeLogEvent(Object source, SdAiChangeLogDto changeLog) {
        super(source);
        this.changeLog = changeLog;
    }
}
