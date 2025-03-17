package com.fit_us.web.emotion.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class CreateEmotionLogCommand {
    private String emotionLevel;
    private List<String> keywords;
    private String location;
    private String situation;
}
