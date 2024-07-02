package com.zaportfolio.qa.projections;

import com.zaportfolio.qa.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "userSummary", types = { User.class })

public interface UserProjection {
    int getId();
    String getName();
    String getEmail();
    String getPhoto();
}
