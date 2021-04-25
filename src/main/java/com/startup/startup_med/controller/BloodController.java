package com.startup.startup_med.controller;

import com.startup.startup_med.entity.Blood;
import com.startup.startup_med.service.BloodService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blood")
public class BloodController extends AbstractController<Blood, BloodService> {

    protected BloodController(BloodService service) {
        super(service);
    }
}
