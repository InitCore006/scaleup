package com.scaleup.service;

import com.scaleup.domain.VerificationType;
import com.scaleup.model.ForgotPasswordToken;
import com.scaleup.model.User;

public interface ForgotPasswordService {

    ForgotPasswordToken createToken(User user, String id, String otp,
                                    VerificationType verificationType,String sendTo);

    ForgotPasswordToken findById(String id);

    ForgotPasswordToken findByUser(Long userId);

    void deleteToken(ForgotPasswordToken token);

    boolean verifyToken(ForgotPasswordToken token,String otp);
}
