package com.startup.startup_med.service.impl;

import com.startup.startup_med.entity.Blood;
import com.startup.startup_med.repo.BloodRepo;
import com.startup.startup_med.service.BloodService;
import org.springframework.stereotype.Service;

@Service
public class BloodServiceImpl extends BaseServiceImpl<Blood, BloodRepo>
        implements BloodService {
    public BloodServiceImpl(BloodRepo repo) {
        super(repo);
    }
}
