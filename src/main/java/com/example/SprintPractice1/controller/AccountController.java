package com.example.SprintPractice1.controller;
import com.example.SprintPractice1.dto.AccountDTO;
import com.example.SprintPractice1.entities.Account;
import com.example.SprintPractice1.exeption.ResourceNotFoundException;
import com.example.SprintPractice1.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable Long id) {
        Account account = accountService.getAccountById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Account not found with id: " + id));
        return ResponseEntity.ok(account);
    }
    @PostMapping
    public Account createAccount(@RequestBody AccountDTO accountDTO) {
        return accountService.createAccount(accountDTO);
    }

    @PreAuthorize("hasRole('USER')") // Only allow users with the 'USER' role to delete accounts
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccount(@PathVariable Long id) {
        accountService.deleteAccount(id);
        return ResponseEntity.noContent().build();
    }
}

