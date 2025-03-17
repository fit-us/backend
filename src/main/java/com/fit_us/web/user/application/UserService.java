package com.fit_us.web.user.application;

import com.fit_us.web.user.application.dto.CreateUserCommand;
import com.fit_us.web.user.domain.User;

public interface UserService {
    User create(CreateUserCommand command);
    void delete(Long id);

}