package com.fit_us.web.emotion.domain;

import com.fit_us.web.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "emotion_log")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder(access = AccessLevel.PROTECTED)

public class EmotionLog extends BaseEntity {
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EmotionLevel emotionLevel;

    @ElementCollection
    @CollectionTable(name = "emotion_keywords", joinColumns = @JoinColumn(name = "emotion_log_id"))
    @Column(name = "keyword")
    private List<String> keywords;

    @Column(nullable = true)
    private String location;

    @Column(nullable = true, length = 500)
    private String situation;

    public static EmotionLog create(String emotionLevel, List<String> keywords, String location, String situation) {
        EmotionLevel parsedEmotionLevel = EmotionLevel.parse(emotionLevel);
        return EmotionLog.builder()
                .emotionLevel(parsedEmotionLevel)
                .keywords(keywords)
                .location(location)
                .situation(situation)
                .build();
    }
}
