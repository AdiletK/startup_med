package com.startup.startup_med.service;

import com.startup.startup_med.entity.Fingerprint;
import com.startup.startup_med.model.FingerprintDto;

public interface FingerprintService extends BaseService<Fingerprint>{

    Fingerprint save(FingerprintDto dto);
}
