package com.startup.startup_med.controller.qr;

import com.startup.startup_med.service.IdentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.image.BufferedImage;
import java.util.UUID;

@RestController
@RequestMapping("/generate/")
public class GenerateCode {
    @Autowired
    private IdentificationService identificationService;

    @PostMapping(value = "code", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<BufferedImage> newQRCode(@RequestParam Long userId) throws Exception {
        UUID uuid = identificationService.generateCode(userId);
        return okResponse(ZxingBarcodeGenerator.generateQRCodeImage(uuid.toString()));
    }

    private ResponseEntity<BufferedImage> okResponse(BufferedImage image) {
        return new ResponseEntity<>(image, HttpStatus.OK);
    }

}
