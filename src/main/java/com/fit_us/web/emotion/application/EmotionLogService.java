    package com.fit_us.web.emotion.application;

    import com.fit_us.web.emotion.domain.EmotionLog;
    import com.fit_us.web.emotion.application.dto.CreateEmotionLogCommand;

    import java.util.List;

    public interface EmotionLogService {
        EmotionLog create(CreateEmotionLogCommand command);
        List<EmotionLog> findAll();
    }
