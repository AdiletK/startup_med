package com.startup.startup_med.model;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String surname;
    private Integer age;
    private Long bloodId;
    private List<Long> diseaseIds;
    private Long countryId;
    private String address;
    private String criminalRecord;
    private List<Long> doctorIds;
    private List<Long> relativeIds;
}
