package com.example.SprintPractice1.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "user_info")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First name is mandatory")
    @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
    private String fName;

    @NotBlank(message = "Last name is mandatory")
    @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters")
    private String lName;

    @NotBlank(message = "Phone number is mandatory")
    @Size(min = 10, max = 20, message = "Phone number must be between 10 and 20 characters")
    private String phone;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    private String email;

    @NotNull(message = "Birth date is mandatory")
    private Date birthDate;

    @NotBlank(message = "Password is mandatory")
    @Size(min = 6, message = "Password should have at least 6 characters")
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "role")
    private List<String> roles;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private List<Authority> authorities;

    public UserInfo(Long id, String fName, String lName, String phone, String email, Date birthDate, String password, List<String> roles, List<Authority> authorities) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.email = email;
        this.birthDate = birthDate;
        this.password = password;
        this.roles = roles;
        this.authorities = authorities;
    }

    public UserInfo() {
    }


    public UserInfo(Long id, String email, String password, List<String> roles, String phone) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "First name is mandatory") @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters") String getfName() {
        return fName;
    }

    public void setfName(@NotBlank(message = "First name is mandatory") @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters") String fName) {
        this.fName = fName;
    }

    public @NotBlank(message = "Last name is mandatory") @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters") String getlName() {
        return lName;
    }

    public void setlName(@NotBlank(message = "Last name is mandatory") @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters") String lName) {
        this.lName = lName;
    }

    public @NotBlank(message = "Phone number is mandatory") @Size(min = 10, max = 20, message = "Phone number must be between 10 and 20 characters") String getPhone() {
        return phone;
    }

    public void setPhone(@NotBlank(message = "Phone number is mandatory") @Size(min = 10, max = 20, message = "Phone number must be between 10 and 20 characters") String phone) {
        this.phone = phone;
    }

    public @NotBlank(message = "Email is mandatory") @Email(message = "Email should be valid") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email is mandatory") @Email(message = "Email should be valid") String email) {
        this.email = email;
    }

    public @NotNull(message = "Birth date is mandatory") Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(@NotNull(message = "Birth date is mandatory") Date birthDate) {
        this.birthDate = birthDate;
    }

    public @NotBlank(message = "Password is mandatory") @Size(min = 6, message = "Password should have at least 6 characters") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "Password is mandatory") @Size(min = 6, message = "Password should have at least 6 characters") String password) {
        this.password = password;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }


}
