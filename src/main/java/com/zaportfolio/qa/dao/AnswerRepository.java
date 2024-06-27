package com.zaportfolio.qa.dao;

import com.zaportfolio.qa.entity.Answer;
import com.zaportfolio.qa.projections.AnswerProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("http://localhost:5173")
@RepositoryRestResource(excerptProjection = AnswerProjection.class)

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    @Query("SELECT a FROM Answer a WHERE a.question.id = :questionId")
    Page<Answer> findAllByQuestionId(@Param("questionId") int questionId, Pageable pageable);
}

