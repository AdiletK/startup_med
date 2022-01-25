package com.startup.startup_med.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class IdentificationDto {
    private UUID uuid;

    private Long userId;

    public boolean checkIsOk(){
        return uuid != null && userId != null;
    }

}
