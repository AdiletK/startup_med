package com.startup.startup_med.controller;

import com.startup.startup_med.entity.User;
import com.startup.startup_med.model.UserDto;
import com.startup.startup_med.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestBody UserDto dto){
        return service.create(dto);
    }

    @PostMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody UserDto dto){
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        return service.delete(id);
    }
}
