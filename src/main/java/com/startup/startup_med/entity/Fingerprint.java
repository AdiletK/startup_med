package com.startup.startup_med.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Fingerprint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(name = "finger_hash")
    private byte[] fingerHash;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
