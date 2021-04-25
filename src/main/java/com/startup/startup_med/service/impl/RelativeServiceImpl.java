package com.startup.startup_med.service.impl;

import com.startup.startup_med.entity.Relative;
import com.startup.startup_med.repo.RelativeRepo;
import com.startup.startup_med.service.RelativeService;
import org.springframework.stereotype.Service;

@Service
public class RelativeServiceImpl extends BaseServiceImpl<Relative, RelativeRepo>
        implements RelativeService {
    public RelativeServiceImpl(RelativeRepo repo) {
        super(repo);
    }
}
