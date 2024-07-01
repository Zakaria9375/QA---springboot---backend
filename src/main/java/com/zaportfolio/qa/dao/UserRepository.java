package com.zaportfolio.qa.dao;

import com.zaportfolio.qa.entity.User;
import com.zaportfolio.qa.projections.UserProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@CrossOrigin("http://localhost:5173")
@RepositoryRestResource(excerptProjection = UserProjection.class)

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<UserProjection> findByEmail(@Param("email") String email);
}
