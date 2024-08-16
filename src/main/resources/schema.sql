-- SQL script to create the database schema for the Account entity

CREATE TABLE IF NOT EXISTS account (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    f_name VARCHAR(255) NOT NULL,
    l_name VARCHAR(255) NOT NULL,
    address VARCHAR(255),
    city VARCHAR(255),
    state VARCHAR(255),
    zip VARCHAR(10),
    phone VARCHAR(20),
    password VARCHAR(255) NOT NULL,
    confirm_password VARCHAR(255) NOT NULL,
    account_type VARCHAR(50),
    email VARCHAR(255) NOT NULL UNIQUE,
    is_active BOOLEAN DEFAULT FALSE,
    balance DOUBLE DEFAULT 0.0
);
