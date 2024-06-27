package com.zaportfolio.qa.dao;

import com.zaportfolio.qa.entity.Question;
import com.zaportfolio.qa.projections.QuestionProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("http://localhost:5173")
@RepositoryRestResource(excerptProjection = QuestionProjection.class)

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    @Query("SELECT q FROM Question q WHERE LOWER(q.title) LIKE LOWER(CONCAT('%', :title, '%'))")
    Page<Question> findByTitleContaining(@Param("title") String title, Pageable pageable);
}