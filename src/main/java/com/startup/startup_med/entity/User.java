package com.startup.startup_med.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private Integer age;

    @ManyToOne
    @JoinColumn(name = "blood_id")
    private Blood blood;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @OneToMany
    private List<Doctor> doctorList;

    @OneToMany
    private List<Disease> diseaseList;

    @OneToMany
    private List<Relative> relativeList;
}
