package com.startup.startup_med.repo;

import com.startup.startup_med.entity.Disease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DiseaseRepo extends JpaRepository<Disease, Long> {
}
