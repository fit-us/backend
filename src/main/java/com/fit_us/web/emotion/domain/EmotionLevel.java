package com.fit_us.web.emotion.domain;

public enum EmotionLevel {
    VERY_UNHAPPY("매우 불쾌함"),
    UNHAPPY("불쾌함"),
    NEUTRAL("보통"),
    SLIGHTLY_HAPPY("약간 기분 좋음"),
    HAPPY("기분 좋음"),
    VERY_HAPPY("매우 기분 좋음");

    private final String description;

    EmotionLevel(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static EmotionLevel parse(String emotionLevel){
        return EmotionLevel.valueOf(emotionLevel.toUpperCase());
    }
}

