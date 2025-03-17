package com.fit_us.web.user.infrastructure;

import com.fit_us.web.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
