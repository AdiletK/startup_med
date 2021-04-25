package com.startup.startup_med.controller;

import com.startup.startup_med.entity.Doctor;
import com.startup.startup_med.service.DoctorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController extends AbstractController<Doctor, DoctorService> {

    protected DoctorController(DoctorService service) {
        super(service);
    }
}
