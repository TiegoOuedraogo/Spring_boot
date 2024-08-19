package com.example.SprintPractice1.controller;

import com.example.SprintPractice1.dto.UserInfoDTO;
import com.example.SprintPractice1.entities.Account;
import com.example.SprintPractice1.entities.UserInfo;
import com.example.SprintPractice1.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/userinfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/email/{email}")
    public UserInfoDTO getUserByEmail(@PathVariable String email) {
        return userInfoService.getUserInfoDTOByEmail(email);
    }
    @GetMapping("/phone/{phone}")
    public UserInfoDTO getUserByPhone(@PathVariable String phone) {
        return userInfoService.getUserInfoDTOByPhone(phone);
    }
    @GetMapping
    public List<Account> getAllUsers() {
        return userInfoService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserInfo getUserById(@PathVariable Long id) {
        return (UserInfo) userInfoService.getUserById(id).orElse(null);
    }

    @GetMapping("/search")
    public List<UserInfo> searchUsersByCriteria(
            @RequestParam(required = false) String fName,
            @RequestParam(required = false) String lName,
            @RequestParam(required = false) String phone,
            @RequestParam(required = false) String email,
            @RequestParam(required = false) Date birthDate) {
        return userInfoService.searchUsersByCriteria(fName, lName, phone, email, birthDate);
    }

    @PostMapping
    public Account createUser(@RequestBody UserInfo userInfo) {
        return userInfoService.createUser(userInfo);
    }

    @PutMapping("/{id}")
    public UserInfo updateUser(@PathVariable Long id, @RequestBody UserInfo updatedUserInfo) {
        return (UserInfo) userInfoService.updateUser(id, updatedUserInfo).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userInfoService.deleteUser(id);
    }

}

