package com.vegetablebirdcoder.springboot.todolist.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {
        return username.equals("haz") && password.equals("123");
    }
}
