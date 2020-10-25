package com.atualyze.backend.service;

import com.atualyze.backend.model.User;
import com.atualyze.backend.repository.UserRepository;
import com.atualyze.backend.web.dto.UserRegistrationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDTO registrationDTO) {
        User user = new User(registrationDTO.getCPF(), registrationDTO.getNome(), registrationDTO.getNascimento(), registrationDTO.getEmail(), registrationDTO.getSenha(), registrationDTO.getTelefone(), registrationDTO.getEndereco());

        return userRepository.save(user);
    }
}