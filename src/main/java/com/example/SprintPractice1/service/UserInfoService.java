package com.example.SprintPractice1.service;

import com.example.SprintPractice1.dto.UserInfoDTO;
import com.example.SprintPractice1.entities.Account;
import com.example.SprintPractice1.entities.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class UserInfoService {
    @Autowired
    private LocalAccountService localAccountService;
    // Implement methods to retrieve user information from local database
    public List<Account> getAllUsers() {
        return localAccountService.getAllAccounts();
    }

    public List<UserInfo> searchUsersByCriteria(String fName, String lName, String phone, String email, Date birthDate) {
        return localAccountService.searchUsersByCriteria(fName, lName, phone, email, birthDate);
    }

    public UserInfoDTO getUserInfoDTOByEmail(String email) {
        Account account = localAccountService.getAccountByEmail(email);
        if (account!= null) {
            UserInfo userInfo = new UserInfo(account.getId(), account.getfName(), account.getlName(), account.getEmail(), account.getRoles());
            return new UserInfoDTO(userInfo);
        }
        return null;
    }

    public UserInfoDTO getUserInfoDTOByPhone(String phone) {
        // Implement logic to retrieve user information from local database using phone number
        return localAccountService.getUserInfoDTOByPhone(phone);
    }

    public Optional<Object> getUserById(Long id) {
        // Implement logic to retrieve user information from local database using id
        return Optional.ofNullable(localAccountService.getAccountById(id));
    }

    public Account createUser(UserInfo userInfo) {
        // Implement logic to create a new user in local database
        return localAccountService.createAccount(new Account(userInfo));
    }

    public void deleteUser(Long id) {
        // Implement logic to delete a user from local database using id
        localAccountService.deleteAccount(id);
    }

    public Optional<Object> updateUser(Long id, UserInfo updatedUserInfo) {
        // Implement logic to update a user in local database using id and updatedUserInfo
        Optional<Account> accountOptional = localAccountService.getAccountById(id);
        if (accountOptional.isPresent()) {
            Account account = accountOptional.get();
            account.setfName(updatedUserInfo.getfName());
            account.setlName(updatedUserInfo.getlName());
            account.setEmail(updatedUserInfo.getEmail());
            localAccountService.createAccount(account);
            return Optional.of(account);
        }
        return Optional.empty();
    }
}