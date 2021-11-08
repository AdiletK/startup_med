package com.startup.startup_med.repo;

import com.startup.startup_med.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CountryRepo extends JpaRepository<Country, Long> {
}
