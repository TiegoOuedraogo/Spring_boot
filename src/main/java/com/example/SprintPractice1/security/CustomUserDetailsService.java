package com.example.SprintPractice1.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Implement your custom logic to retrieve user details from your database based on the provided username
        // For demonstration purposes, we will just create a dummy user
        UserBuilder builder = User.withUsername("user");
        builder.password("password");
        builder.roles("USER");
        return builder.build();
    }

    // Implement additional methods for retrieving user details from your database based on the provided email
    public UserDetails retrieveUserByEmail(String email) {
        // Implement your custom logic to retrieve user details from your database based on the provided email
        // For demonstration purposes, we will just create a dummy user
        UserBuilder builder = User.withUsername("user");
        builder.password("password");
        builder.roles("USER");
        return builder.build();
    }

    // Implement additional methods for retrieving user details from your database based on the provided ID
    public UserDetails retrieveUserById(Long id) {
        // Implement your custom logic to retrieve user details from your database based on the provided ID
        // For demonstration purposes, we will just create a dummy user
        UserBuilder builder = User.withUsername("user");
        builder.password("password");
        builder.roles("USER");
        return builder.build();
    }

    // Implement additional methods for retrieving user details from your database based on the provided JWT token
    public UserDetails retrieveUserByToken(String token) {
        // Implement your custom logic to retrieve user details from your database based on the provided JWT token
        // For demonstration purposes, we will just create a dummy user
        UserBuilder builder = User.withUsername("user");
        builder.password("password");
        builder.roles("USER");
        return builder.build();
    }

    // Implement additional methods for retrieving user details from your database based on the provided phone number
    public UserDetails retrieveUserByPhone(long phone) {
        // Implement your custom logic to retrieve user details from your database based on the provided phone number
        // For demonstration purposes, we will just create a dummy user
        UserBuilder builder = User.withUsername("user");
        builder.password("password");
        builder.roles("USER");
        return builder.build();
    }
}
