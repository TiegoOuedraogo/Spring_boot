package com.example.SprintPractice1.service;

import com.example.SprintPractice1.entities.UserInfo;
import com.example.SprintPractice1.repos.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    private PasswordEncoder passwordEncoder;

    @Autowired
    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public UserInfo saveUser(UserInfo userInfo) {
        // Encode the password before saving
        String encodedPassword = passwordEncoder.encode(userInfo.getPassword());
        userInfo.setPassword(encodedPassword);
        return userInfoRepository.save(userInfo);
    }

}

