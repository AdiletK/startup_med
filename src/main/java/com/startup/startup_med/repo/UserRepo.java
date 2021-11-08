package com.startup.startup_med.repo;

import com.startup.startup_med.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepo extends JpaRepository<User, Long> {
}
