package com.startup.startup_med.repo;

import com.startup.startup_med.entity.Fingerprint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FingerprintRepo extends JpaRepository<Fingerprint, Long> {
}
