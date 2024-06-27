package com.zaportfolio.qa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="questions", schema = "qa3")
@Getter
@Setter
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="title")
    private String title;

    @Column(name="description", columnDefinition = "text")
    private String description;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP(0)")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at", columnDefinition = "TIMESTAMP(0)")
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @Getter
    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Answer> answers;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public int getUserId() {
        if (user == null) {
            return -1;
        }
        return user.getId();
    }
}
