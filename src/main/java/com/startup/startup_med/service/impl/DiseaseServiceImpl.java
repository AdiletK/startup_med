package com.startup.startup_med.service.impl;

import com.startup.startup_med.entity.Disease;
import com.startup.startup_med.repo.DiseaseRepo;
import com.startup.startup_med.service.DiseaseService;
import org.springframework.stereotype.Service;

@Service
public class DiseaseServiceImpl extends BaseServiceImpl<Disease, DiseaseRepo>
        implements DiseaseService {
    public DiseaseServiceImpl(DiseaseRepo repo) {
        super(repo);
    }
}
