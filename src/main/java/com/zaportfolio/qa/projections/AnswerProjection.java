package com.zaportfolio.qa.projections;

import com.zaportfolio.qa.entity.Answer;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDateTime;

@Projection(name = "answerSummary", types = { Answer.class })
public interface AnswerProjection {
    int getId();
    String getContent();
    LocalDateTime getCreatedAt();
    LocalDateTime getUpdatedAt();
    int getQuestionId();
    int getUserId();
}