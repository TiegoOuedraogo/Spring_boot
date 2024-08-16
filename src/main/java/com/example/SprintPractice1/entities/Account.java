package com.example.SprintPractice1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fName,lName, address, city, state, zip, phone, password, confirmPassword, accountType;
    private String email;
    private boolean isActive;
    private double balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(Long id, String fName, String lName, String address, String city, String state, String zip, String phone, String password, String confirmPassword, String accountType, String email, boolean isActive, double balance) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.accountType = accountType;
        this.email = email;
        this.isActive = isActive;
        this.balance = balance;
    }

    public Account() {
    }

    public Account(Long id, String fName, String lName, String password, String confirmPassword, String accountType, String email, double balance) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.accountType = accountType;
        this.email = email;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return isActive == account.isActive && Double.compare(balance, account.balance) == 0 && Objects.equals(id, account.id) && Objects.equals(fName, account.fName) && Objects.equals(lName, account.lName) && Objects.equals(address, account.address) && Objects.equals(city, account.city) && Objects.equals(state, account.state) && Objects.equals(zip, account.zip) && Objects.equals(phone, account.phone) && Objects.equals(password, account.password) && Objects.equals(confirmPassword, account.confirmPassword) && Objects.equals(accountType, account.accountType) && Objects.equals(email, account.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fName, lName, address, city, state, zip, phone, password, confirmPassword, accountType, email, isActive, balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", accountType='" + accountType + '\'' +
                ", email='" + email + '\'' +
                ", isActive=" + isActive +
                ", balance=" + balance +
                '}';
    }
}
