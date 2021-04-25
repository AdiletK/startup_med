package com.startup.startup_med.service.impl;

import com.startup.startup_med.service.BaseService;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.MappedSuperclass;
import java.util.List;

@MappedSuperclass
public class BaseServiceImpl<T, R extends JpaRepository<T, Long>>
        implements BaseService<T> {
    protected final R repo;

    public BaseServiceImpl(R repo) {
        this.repo = repo;
    }

    @Override
    public T create(T t) {
        return repo.save(t);
    }

    @Override
    public T findById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("The object not found. ID:" + id));
    }

    @Override
    public List<T> findAll() {
        return repo.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public T getOne(Long id) {
        return repo.getOne(id);
    }
}
