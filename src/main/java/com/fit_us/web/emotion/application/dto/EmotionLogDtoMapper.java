package com.fit_us.web.emotion.application.dto;

import com.fit_us.web.emotion.domain.EmotionLog;
import com.fit_us.web.emotion.presentation.dto.EmotionLogResponse;

import java.util.List;

public class EmotionLogDtoMapper  {

    public static EmotionLogResponse toResponse(EmotionLog emotionLog){
        if(emotionLog == null){
            throw  new IllegalArgumentException("EmotionLog cannot be null. ");
        }
        return new EmotionLogResponse(
                emotionLog.getId(),
                emotionLog.getEmotionLevel(),
                emotionLog.getKeywords(),
                emotionLog.getLocation(),
                emotionLog.getSituation()
        );
    }

    public static List<EmotionLogResponse> toResponseList(List<EmotionLog> emotionLogs){
        return emotionLogs.stream()
                .map(EmotionLogDtoMapper::toResponse)
                .toList();
    }
}
