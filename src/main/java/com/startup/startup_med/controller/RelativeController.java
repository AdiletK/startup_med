package com.startup.startup_med.controller;

import com.startup.startup_med.entity.Doctor;
import com.startup.startup_med.entity.Relative;
import com.startup.startup_med.service.DoctorService;
import com.startup.startup_med.service.RelativeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/relative")
public class RelativeController extends AbstractController<Relative, RelativeService> {

    protected RelativeController(RelativeService service) {
        super(service);
    }
}
