package com.fit_us.web.emotion.application;

import com.fit_us.web.emotion.domain.EmotionLog;
import com.fit_us.web.emotion.infrastructure.EmotionLogRepository;
import com.fit_us.web.emotion.application.dto.CreateEmotionLogCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmotionLogServiceImpl implements EmotionLogService{
    private final EmotionLogRepository emotionLogRepository;

    /**
     * TODO:
     * 유저에 대한 형식으로 변경 필요
     */
    @Override
    public EmotionLog create(CreateEmotionLogCommand command) {
        EmotionLog newEmotionLog = EmotionLog.create(
                command.getEmotionLevel(),
                command.getKeywords(),
                command.getLocation(),
                command.getSituation());

        return emotionLogRepository.save(newEmotionLog);
    }

    @Override
    public List<EmotionLog> findAll() {
        return emotionLogRepository.findAll();
    }
}
