package com.startup.startup_med.repo;

import com.startup.startup_med.entity.Identification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentificationRepo extends JpaRepository<Identification, Long> {
    Identification findByUserId(Long userId);
}
