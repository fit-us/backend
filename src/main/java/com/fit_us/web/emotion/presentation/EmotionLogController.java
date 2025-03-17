package com.fit_us.web.emotion.presentation;

import com.fit_us.web.emotion.application.EmotionLogService;
import com.fit_us.web.emotion.application.dto.CreateEmotionLogCommand;
import com.fit_us.web.emotion.application.dto.EmotionLogDtoMapper;
import com.fit_us.web.emotion.domain.EmotionLog;
import com.fit_us.web.emotion.presentation.dto.EmotionLogResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmotionLogController {
    /**
     * CR
     */
    private final EmotionLogService emotionLogService;
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    EmotionLogResponse createEmotionLog(@RequestBody CreateEmotionLogCommand command){
        EmotionLog emotionLog = emotionLogService.create(command);
        return EmotionLogDtoMapper.toResponse(emotionLog);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    List<EmotionLogResponse> findAllEmotionLogs(){
        List<EmotionLog> emotionLogs = emotionLogService.findAll();
        return EmotionLogDtoMapper.toResponseList(emotionLogs);
    }
}