package com.atualyze.backend.service;

import com.atualyze.backend.model.User;
import com.atualyze.backend.web.dto.UserRegistrationDTO;

public interface UserService {
    User save(UserRegistrationDTO registrationDTO);
}
