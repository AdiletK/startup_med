package com.startup.startup_med.service;

import java.util.List;

public interface BaseService<T> {
    T create(T t);

    T findById(Long id);

    List<T> findAll();

    void deleteById(Long id);

    T getOne(Long id);
}
