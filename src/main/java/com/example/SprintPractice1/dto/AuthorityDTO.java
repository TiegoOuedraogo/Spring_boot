package com.example.SprintPractice1.dto;


public class AuthorityDTO {
    private Long id;
    private String authority;

    // Constructors
    public AuthorityDTO() {
        // Default constructor
    }

    public AuthorityDTO(Long id, String authority) {
        this.id = id;
        this.authority = authority;
    }

    public AuthorityDTO(String authority) {
        this.authority = authority;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
