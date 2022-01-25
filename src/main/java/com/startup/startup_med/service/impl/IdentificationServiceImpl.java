package com.startup.startup_med.service.impl;

import com.startup.startup_med.entity.Identification;
import com.startup.startup_med.model.IdentificationDto;
import com.startup.startup_med.repo.IdentificationRepo;
import com.startup.startup_med.service.IdentificationService;
import com.startup.startup_med.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class IdentificationServiceImpl extends BaseServiceImpl<Identification, IdentificationRepo>
        implements IdentificationService {
    @Autowired
    private UserService userService;

    public IdentificationServiceImpl(IdentificationRepo repo) {
        super(repo);
    }

    @Override
    public Identification save(IdentificationDto dto) {
        Identification identification = new Identification();
        identification.setUuid(dto.getUuid());
        identification.setUser(userService.findById(dto.getUserId()));
        return create(identification);
    }

    @Override
    public Identification findByUserId(Long userId) {
        return repo.findByUserId(userId);
    }

    @Transactional
    @Override
    public UUID generateCode(Long userId) {
        UUID uuid;
        Identification identification = findByUserId(userId);
        if (identification == null)
            uuid = generateNewCode(userId);
        else
            uuid = identification.getUuid();
        return uuid;
    }

    private UUID generateNewCode(Long userId) {
        UUID uuid = UUID.randomUUID();
        IdentificationDto dto = IdentificationDto.builder()
                .userId(userId)
                .uuid(uuid)
                .build();
        save(dto);
        return uuid;
    }
}
