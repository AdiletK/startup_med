package com.startup.startup_med.controller;

import com.startup.startup_med.entity.Fingerprint;
import com.startup.startup_med.model.FingerprintDto;
import com.startup.startup_med.service.FingerprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/finger")
public class FingerprintController {
    @Autowired
    private FingerprintService service;

    @GetMapping("/{id}")
    public Fingerprint getById(@PathVariable Long id){
        return service.findById(id);
    }

    @GetMapping("/all")
    public List<Fingerprint> getAll(){
        return service.findAll();
    }

    @PostMapping
    public Fingerprint create(@RequestBody FingerprintDto dto){
        return service.save(dto);
    }

    @PutMapping
    public Fingerprint edit(@RequestBody Fingerprint fingerprint){
        return service.create(fingerprint);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.deleteById(id);
    }

}
