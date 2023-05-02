package com.example.testrestservice.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import javax.crypto.spec.PSource;

@Data
@Builder
public class Request {

    @NotBlank
    @Size(max = 32)
    String uid;

    @NotBlank
    @Size(max = 32)
    String operationUid;

    String systemName;

    @NotBlank
    String systemTime;

    String source;

    int communicationId;
    int templateId;

    @Max(7)
    int productCode;

    @Max(8)
    int smsCode;
}
