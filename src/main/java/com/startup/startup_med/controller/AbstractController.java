package com.startup.startup_med.controller;

import com.startup.startup_med.service.BaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.MappedSuperclass;
import java.util.List;

@MappedSuperclass
public abstract class AbstractController<E,S extends BaseService<E>> {
    private final S service;

    protected AbstractController(S service) {
        this.service = service;
    }


    @GetMapping
    public List<E> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public E findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping
    public E save(@RequestBody E e){
        return service.create(e);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.ok("Element deleted!!");
    }
}
