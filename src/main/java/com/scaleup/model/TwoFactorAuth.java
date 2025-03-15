package com.scaleup.model;

import com.scaleup.domain.VerificationType;
import lombok.Data;

@Data
public class TwoFactorAuth {

    private boolean isEnabled = false;
    private VerificationType sendTo;
}
