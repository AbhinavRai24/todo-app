package com.ab.todo_application.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationServices {
    public boolean authenticate(String username, String password) {
        return username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("dummy");
    }
}
