package com.startup.startup_med.controller;

import com.startup.startup_med.entity.Country;
import com.startup.startup_med.entity.Disease;
import com.startup.startup_med.service.CountryService;
import com.startup.startup_med.service.DiseaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/disease")
public class DiseaseController extends AbstractController<Disease, DiseaseService> {

    protected DiseaseController(DiseaseService service) {
        super(service);
    }
}
