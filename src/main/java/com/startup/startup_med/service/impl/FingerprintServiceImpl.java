package com.startup.startup_med.service.impl;

import com.startup.startup_med.entity.Fingerprint;
import com.startup.startup_med.model.FingerprintDto;
import com.startup.startup_med.repo.FingerprintRepo;
import com.startup.startup_med.service.FingerprintService;
import com.startup.startup_med.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FingerprintServiceImpl extends BaseServiceImpl<Fingerprint, FingerprintRepo>
        implements FingerprintService {
    @Autowired
    private UserService userService;
    public FingerprintServiceImpl(FingerprintRepo repo) {
        super(repo);
    }

    @Override
    public Fingerprint save(FingerprintDto dto) {
        Fingerprint fingerprint = new Fingerprint();
        fingerprint.setFingerHash(dto.getFingerHash());
        fingerprint.setUser(userService.findById(dto.getUserId()));
        return create(fingerprint);
    }
}
