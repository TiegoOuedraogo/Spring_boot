-- Clear existing data in the user_info table using DELETE
DELETE FROM user_info;
-- Insert initial data into address table
INSERT INTO address (address, city, state, zip)
VALUES
('123 Main St', 'Springfield', 'IL', '62704'),
('456 Oak St', 'Springfield', 'IL', '62704');

-- Insert initial data into account table
INSERT INTO account (username, email, password, confirm_password, phone)
VALUES
('tchico1er', 'tchico1er@example.com', 'password1', 'password1', '5551234567'),
('ayaan_oued1er', 'ayaan_oued1er@example.com', 'password2', 'password2', '5559876543');

-- Insert initial roles into roles table
INSERT INTO roles (name) VALUES ('ROLE_USER'), ('ROLE_ADMIN');

-- Insert initial data into user_info table
INSERT INTO user_info (f_name, l_name, phone, birth_date, email, address_id, account_id)
VALUES
('Tiego', 'Ouedraogo', '555-1234-2345', '1998-03-12', 'tchico1er@example.com', 1, 1),
('Ayaan', 'Ouedraogo', '7555-1234-2345', '1999-03-12', 'ayaan_oued1er@example.com', 2, 2);

-- Assign roles to users in user_roles table
INSERT INTO user_roles (user_id, role_id) VALUES
(1, 1),  -- Assign 'ROLE_USER' to Tiego
(1, 2),  -- Assign 'ROLE_ADMIN' to Tiego
(2, 1);  -- Assign 'ROLE_USER' to Ayaan