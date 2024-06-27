package com.zaportfolio.qa.projections;

import java.time.LocalDateTime;

public interface QuestionProjection {
    int getId();
    String getTitle();
    String getDescription();
    LocalDateTime getCreatedAt();
    LocalDateTime getUpdatedAt();
    int getUserId();
}
