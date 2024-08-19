package com.example.SprintPractice1.repos;

import com.example.SprintPractice1.entities.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
    // Find by first name
    List<UserInfo> findByFName(String fName);

    // Find by last name
    List<UserInfo> findByLName(String lName);

    // Find by phone
    List<UserInfo> findByPhone(String phone);

    // Find by email
    UserInfo findByEmail(String email);

    // Find by birth date
    List<UserInfo> findByBirthDate(Date birthDate);

    // Find by first name, last name, and phone
    List<UserInfo> findByFNameAndLNameAndPhone(String fName, String lName, String phone);

    // Find by first name and last name
    List<UserInfo> findByFNameAndLName(String fName, String lName);

    // Find by last name and phone
    List<UserInfo> findByLNameAndPhone(String lName, String phone);

    // Find by email and phone
    List<UserInfo> findByEmailAndPhone(String email, String phone);

    // Find by first name and birth date
    List<UserInfo> findByFNameAndBirthDate(String fName, Date birthDate);

    // Find by last name and birth date
    List<UserInfo> findByLNameAndBirthDate(String lName, Date birthDate);

    // Find by email and birth date
    List<UserInfo> findByEmailAndBirthDate(String email, Date birthDate);
}

