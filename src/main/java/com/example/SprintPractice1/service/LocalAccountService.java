package com.example.SprintPractice1.service;

import com.example.SprintPractice1.dto.AccountDTO;
import com.example.SprintPractice1.entities.Account;
import com.example.SprintPractice1.repos.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        account.setfName(accountDTO.getfName());
        account.setlName(accountDTO.getlName());
        account.setEmail(accountDTO.getEmail());
        account.setAddress(accountDTO.getAddress());
        account.setCity(accountDTO.getCity());
        account.setState(accountDTO.getState());
        account.setZip(accountDTO.getZip());
        account.setPhone(accountDTO.getPhone());
        account.setPassword(accountDTO.getPassword());
        account.setConfirmPassword(accountDTO.getConfirmPassword());
        account.setAccountType(accountDTO.getAccountType());
        account.setActive(accountDTO.isActive());
        account.setBalance(accountDTO.getBalance());
        return accountRepository.save(account);
    }

    @Override
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }
}

