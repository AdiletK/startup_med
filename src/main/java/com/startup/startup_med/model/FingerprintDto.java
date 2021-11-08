package com.startup.startup_med.model;

import lombok.Data;

@Data
public class FingerprintDto {
    private byte[] fingerHash;

    private Long userId;

    public boolean checkIsOk(){
        return fingerHash != null && userId != null;
    }
}
