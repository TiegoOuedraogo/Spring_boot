package com.example.SprintPractice1.utils;

public class UtilityClass {
    public static final String EMAIL_REGEX = "^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$";
    public static final String NAME_REGEX = "^[a-zA-Z ]+$";
    public static final String PHONE_REGEX = "^[0-9]{10}$";
    public static final String ACCOUNT_NUMBER_REGEX = "^[0-9]{8}$";
    public static final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
    public static final String TRANSACTION_AMOUNT_REGEX = "^[0-9]+(\\.[0-9]{1,2})?$";
    public static final String TRANSACTION_TYPE_REGEX = "^(Deposit|Withdrawal)$";
    public static final String TRANSACTION_DATE_REGEX = "^(0[1-9]|1[0-2])/(0[1-9]|1\\d|2[0-9]|3[01])/(19|20)\\d\\d$";
    public static final String CREDIT_CARD_NUMBER_REGEX = "^[0-9]{16}$";
    public static final String CREDIT_CARD_EXPIRATION_DATE_REGEX = "^(0[1-9]|1[0-2])/(20)\\d\\d$";
    public static final String CREDIT_CARD_CVV_REGEX = "^[0-9]{3}$";
    public static final String CREDIT_CARD_HOLDER_NAME_REGEX = "^[a-zA-Z ]+$";
    public static final String CREDIT_CARD_TYPE_REGEX = "^(Visa|MasterCard|American Express)$";
    public static final String PAYMENT_METHOD_REGEX = "^(Bank Transfer|Credit Card)$";
    public static final String PAYMENT_STATUS_REGEX = "^(Completed|Failed)$";
}

