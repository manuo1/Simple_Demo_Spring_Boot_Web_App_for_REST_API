package com.manuo1.web_app.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manuo1.web_app.users.model.User;
import com.manuo1.web_app.users.repository.UserProxy;

import lombok.Data;

@Data
@Service // (equal to @Component) indicates that the class is a bean, and that its role is to communicate with the database
public class UserService {

    @Autowired
    private UserProxy userProxy;

    public Iterable<User> getAllUsers() {
        return userProxy.getAllUsers();
    }
	
}
