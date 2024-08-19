package com.example.SprintPractice1.repos;


import com.example.SprintPractice1.entities.Account;
import com.example.SprintPractice1.entities.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByEmail(String email);
    Account findByPhone(String phone);

    List<UserInfo> searchUsersByCriteria(String fName, String lName, String phone, String email, Date birthDate);
}

