package com.startup.startup_med.controller;

import com.startup.startup_med.entity.Country;
import com.startup.startup_med.service.CountryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryController extends AbstractController<Country, CountryService> {

    protected CountryController(CountryService service) {
        super(service);
    }
}
