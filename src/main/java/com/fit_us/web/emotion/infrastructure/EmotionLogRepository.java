package com.fit_us.web.emotion.infrastructure;

import com.fit_us.web.emotion.domain.EmotionLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmotionLogRepository extends JpaRepository<EmotionLog, Long> {
}
