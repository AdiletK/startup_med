package com.startup.startup_med.repo;

import com.startup.startup_med.entity.Relative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelativeRepo extends JpaRepository<Relative, Long> {
}
