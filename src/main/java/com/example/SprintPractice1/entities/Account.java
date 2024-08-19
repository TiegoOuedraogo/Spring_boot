package com.example.SprintPractice1.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Username is mandatory")
    @Column(name = "username", nullable = false)
    private String username;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @NotBlank(message = "Password is mandatory")
    @Size(min = 6, message = "Password should have at least 6 characters")
    @Column(name = "password", nullable = false)
    private String password;

    @NotBlank(message = "Confirm Password is mandatory")
    @Size(min = 6, message = "Confirm Password should have at least 6 characters")
    @Column(name = "confirm_password", nullable = false)
    private String confirmPassword;

    @NotBlank(message = "Phone is mandatory")
    @Size(min = 10, max = 20, message = "Phone number must be between 10 and 20 characters")
    @Column(name = "phone", nullable = false)
    private String phone;

    public Account(UserInfo userInfo) {
        this.username = userInfo.getUsername();
        this.email = userInfo.getEmail();
        this.password = userInfo.getPassword();
        this.confirmPassword = userInfo.getConfirmPassword();
        this.phone = userInfo.getPhone();
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id) &&
                Objects.equals(username, account.username) &&
                Objects.equals(email, account.email) &&
                Objects.equals(password, account.password) &&
                Objects.equals(confirmPassword, account.confirmPassword) &&
                Objects.equals(phone, account.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, email, password, confirmPassword, phone);
    }

    public String getfName() {
        return username.split(" ")[0];
    }

    public void setfName(@NotBlank(message = "First name is mandatory") @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters") String s) {
    }

    public String getlName() {
        String[] names = username.split(" ");
        if (names.length > 1) {
            return names[names.length - 1];
        } else {
            return "";
        }
    }
}

