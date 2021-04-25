package com.startup.startup_med.service;

import com.startup.startup_med.entity.User;
import com.startup.startup_med.model.UserDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    ResponseEntity<String> create(UserDto dto);

    ResponseEntity<String> update(Long id, UserDto dto);

    List<User> findAll();

    User findById(Long id);

    ResponseEntity<String> delete(Long id);
}
