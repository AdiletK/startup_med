package com.startup.startup_med.service.impl;

import com.startup.startup_med.entity.User;
import com.startup.startup_med.model.UserDto;
import com.startup.startup_med.repo.UserRepo;
import com.startup.startup_med.service.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepo repo;
    private final BloodService bloodService;
    private final CountryService countryService;
    private final DiseaseService diseaseService;
    private final DoctorService doctorService;
    private final RelativeService relativeService;

    public UserServiceImpl(UserRepo repo, BloodService bloodService,
                           CountryService countryService,
                           DiseaseService diseaseService,
                           DoctorService doctorService,
                           RelativeService relativeService) {
        this.repo = repo;
        this.bloodService = bloodService;
        this.countryService = countryService;
        this.diseaseService = diseaseService;
        this.doctorService = doctorService;
        this.relativeService = relativeService;
    }

    @Override
    public ResponseEntity<String> create(UserDto dto) {
        User user = new User();
        ConvertDtoToEntity(dto, user);
        return new ResponseEntity<>("Element created", HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<String> update(Long id, UserDto dto) {
        User user = new User();
        user.setId(id);
        ConvertDtoToEntity(dto, user);
        return new ResponseEntity<>("Element updated", HttpStatus.ACCEPTED);

    }

    @Override
    public List<User> findAll() {
        return repo.findAll();
    }

    @Override
    public User findById(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Element not found!!"));
    }

    @Override
    public ResponseEntity<String> delete(Long id) {
        repo.deleteById(id);
        return new ResponseEntity<>("Element deleted!!", HttpStatus.ACCEPTED);
    }

    private void ConvertDtoToEntity(UserDto dto, User user) {
        user.setName(dto.getName());
        user.setSurname(dto.getSurname());
        user.setAge(dto.getAge());
        user.setBlood(bloodService.getOne(dto.getBloodId()));
        user.setCountry(countryService.getOne(dto.getCountryId()));
        user.setDoctorList(dto.getDoctorIds().stream().map(doctorService::getOne).collect(Collectors.toList()));
        user.setDiseaseList(dto.getDiseaseIds().stream().map(diseaseService::getOne).collect(Collectors.toList()));
        user.setRelativeList(dto.getRelativeIds().stream().map(relativeService::getOne).collect(Collectors.toList()));
        repo.save(user);
    }
}
