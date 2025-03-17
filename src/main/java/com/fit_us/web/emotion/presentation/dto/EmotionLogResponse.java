package com.fit_us.web.emotion.presentation.dto;

import com.fit_us.web.emotion.domain.EmotionLevel;

import java.util.List;

public record EmotionLogResponse(Long id, EmotionLevel emotionLevel, List<String> keywords, String location, String situation) {
}
