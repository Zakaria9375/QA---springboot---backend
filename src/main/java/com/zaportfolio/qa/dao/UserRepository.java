package com.zaportfolio.qa.dao;

import com.zaportfolio.qa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:5173")
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(@Param("email") String email);
}
