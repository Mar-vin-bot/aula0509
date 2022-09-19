package com.exercicio2.exercicio_2.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.exercicio2.exercicio_2.repositorie.UserRepositorie;

public class UserService {

    @Autowired
    private UserRepositorie repositorie;
    
}
