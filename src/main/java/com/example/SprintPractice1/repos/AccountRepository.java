package com.example.SprintPractice1.repos;


import com.example.SprintPractice1.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByEmail(String email);
    Account findByPhone(String phone);
    Account findByAccountType(String accountType);
    Account findByEmailAndAccountType(String email, String accountType);
    Account findByPhoneAndAccountType(String phone, String accountType);
}

