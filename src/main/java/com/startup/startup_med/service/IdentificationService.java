package com.startup.startup_med.service;

import com.startup.startup_med.entity.Identification;
import com.startup.startup_med.model.IdentificationDto;

import java.util.UUID;

public interface IdentificationService extends BaseService<Identification>{

    Identification save(IdentificationDto dto);

    Identification findByUserId(Long userId);

    UUID generateCode(Long userId);

}
