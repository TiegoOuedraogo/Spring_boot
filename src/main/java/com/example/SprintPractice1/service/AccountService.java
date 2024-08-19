package com.example.SprintPractice1.service;

import com.example.SprintPractice1.dto.AccountDTO;
import com.example.SprintPractice1.entities.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    List<Account> getAllAccounts();
    Optional<Account> getAccountById(Long id);
    Account createAccount(Account account);

    Account createAccount(AccountDTO accountDTO);

    void deleteAccount(Long id);
}

