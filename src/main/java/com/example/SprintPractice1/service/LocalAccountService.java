package com.example.SprintPractice1.service;

import com.example.SprintPractice1.dto.AccountDTO;
import com.example.SprintPractice1.dto.UserInfoDTO;
import com.example.SprintPractice1.entities.Account;
import com.example.SprintPractice1.entities.UserInfo;
import com.example.SprintPractice1.repos.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class LocalAccountService implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Optional<Account> getAccountById(Long id) {
        return accountRepository.findById(id);
    }

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account createAccount(AccountDTO accountDTO) {
        Account account = new Account();
        account.setUsername(accountDTO.getUsername());
        account.setEmail(accountDTO.getEmail());
        account.setPassword(accountDTO.getPassword());
        account.setConfirmPassword(accountDTO.getConfirmPassword());
        return accountRepository.save(account);
    }

    @Override
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }

    public List<UserInfo> searchUsersByCriteria(String fName, String lName, String phone, String email, Date birthDate) {
        return accountRepository.searchUsersByCriteria(fName, lName, phone, email, birthDate);
    }

    public Account getAccountByEmail(String email) {
        return accountRepository.findByEmail(email);
    }

    public UserInfoDTO getUserInfoDTOByPhone(String phone) {
        Account account = accountRepository.findByPhone(phone);
        if (account == null) {
            return null;
        }
        UserInfo userInfo = new UserInfo(account.getId(), account.getfName(), account.getlName(), account.getPhone(), account.getEmail());
        return new UserInfoDTO(userInfo, account.getRoles());
    }
}

