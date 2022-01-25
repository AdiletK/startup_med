//package com.startup.startup_med.controller;
//
//import com.startup.startup_med.entity.Identification;
//import com.startup.startup_med.model.IdentificationDto;
//import com.startup.startup_med.service.IdentificationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/finger")
//public class FingerprintController {
//    @Autowired
//    private IdentificationService service;
//
//    @GetMapping("/{id}")
//    public Identification getById(@PathVariable Long id){
//        return service.findById(id);
//    }
//
//    @GetMapping("/all")
//    public List<Identification> getAll(){
//        return service.findAll();
//    }
//
//    @PostMapping
//    public Identification create(@RequestBody IdentificationDto dto){
//        return service.save(dto);
//    }
//
//    @PutMapping
//    public Identification edit(@RequestBody Identification identification){
//        return service.create(identification);
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable Long id){
//        service.deleteById(id);
//    }
//
//}
