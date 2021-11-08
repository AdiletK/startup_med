package com.startup.startup_med.repo;

import com.startup.startup_med.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DoctorRepo extends JpaRepository<Doctor, Long> {
}
