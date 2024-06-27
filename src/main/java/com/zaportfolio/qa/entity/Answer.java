package com.zaportfolio.qa.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.rest.core.annotation.RestResource;

import java.time.LocalDateTime;

@Entity
@Table(name = "answers", schema = "qa3")
@Getter
@Setter
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;

    @Column(name="content", columnDefinition = "text")
    private String content;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP(0)")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at", columnDefinition = "TIMESTAMP(0)")
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = true)
    private User user;

    public int getUserId() {
        if (user == null) {
            return -1;
        }
        return user.getId();
    }

    public int getQuestionId() {
        return  question.getId();
    }
}
