package com.startup.startup_med.repo;

import com.startup.startup_med.entity.Blood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodRepo extends JpaRepository<Blood, Long> {
}
