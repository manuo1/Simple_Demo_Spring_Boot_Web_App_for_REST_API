package com.manuo1.web_app.users.model;

import lombok.Data;

@Data // lombok
public class User {

    private Integer id;

    private String firstName;

    private String lastName;

    private String mail;

    private String password;
}
