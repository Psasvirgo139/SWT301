package nnkhoi.example;

import java.util.regex.Pattern;

public class AccountService {
    public boolean registerAccount(String username, String password, String email){
        if (username == null || username.isEmpty()){
            throw new IllegalArgumentException("User name cannot be null or empty");
        }
        if (password == null || !(password.length() > 6)){
            throw new IllegalArgumentException("Password must be more than 6 characters");
        }
        if (!isValidEmail(email)){
            throw new IllegalArgumentException("Invalid email address");
        }
        return true;
    }

    public boolean isValidEmail(String email){
        if (email == null || email.isEmpty()) return false;
        String emailRegex = "(?:[a-z0-9!#$%&'*+\\x2f=?^_`\\x7b-\\x7d~\\x2d]+(?:\\.[a-z0-9!#$%&'*+\\x2f=?^_`\\x7b-\\x7d~\\x2d]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9\\x2d]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9\\x2d]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9\\x2d]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
        return Pattern.matches(emailRegex, email);
    }
}
