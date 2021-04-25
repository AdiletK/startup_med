package com.startup.startup_med.service.impl;

import com.startup.startup_med.entity.Doctor;
import com.startup.startup_med.repo.DoctorRepo;
import com.startup.startup_med.service.DoctorService;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl extends BaseServiceImpl<Doctor, DoctorRepo>
        implements DoctorService {

    public DoctorServiceImpl(DoctorRepo repo) {
        super(repo);
    }

}
