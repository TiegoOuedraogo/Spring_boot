package com.example.SprintPractice1.dto;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;

public class UserInfoDTO {
    private Long id;
    private String fName;
    private String lName;
    private String phone;
    private String email;
    private Date birthDate;
    private String password;
    private List<String> roles;
    private List<String> authorities; // Changed from List<AuthorityDTO> to List<String>

    // Constructors, getters, and setters

    public UserInfoDTO(Long id, String fName, String lName, String email, List<String> roles) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.roles = roles;
    }

    public UserInfoDTO() {}

    public UserInfoDTO(Long id, String fName, String lName, String phone, String email, List<String> authorities) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.email = email;
        this.authorities = authorities;
    }

    public UserInfoDTO(String email, String lName, String fName, Long id) {
        this.email = email;
        this.lName = lName;
        this.fName = fName;
        this.id = id;
    }

    // Additional constructor to handle List<GrantedAuthority> to List<String> conversion
    public UserInfoDTO(Long id, String fName, String lName, String phone, String email, List<? extends GrantedAuthority> authorities, List<String> roles) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.email = email;
        this.authorities = authorities.stream()
                .map(GrantedAuthority::getAuthority) // Extract the authority string
                .collect(Collectors.toList());
        this.roles = roles;
    }

    // Getters and setters

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public List<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<String> authorities) {
        this.authorities = authorities;
    }


}
