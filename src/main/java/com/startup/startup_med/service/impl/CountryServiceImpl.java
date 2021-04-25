package com.startup.startup_med.service.impl;

import com.startup.startup_med.entity.Country;
import com.startup.startup_med.repo.CountryRepo;
import com.startup.startup_med.service.CountryService;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl extends BaseServiceImpl<Country, CountryRepo>
        implements CountryService {
    public CountryServiceImpl(CountryRepo repo) {
        super(repo);
    }
}
