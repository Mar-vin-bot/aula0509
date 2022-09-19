package com.example2_1.Log.service;

import com.example2_1.Log.entity.Log;
import org.springframework.beans.factory.annotation.Autowired;

import com.example2_1.Log.Repositorie.LogRepositorie;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    @Autowired
    private LogRepositorie repositorie;


    public Log create(Log obj) {
       return repositorie.save(obj);
    }
    
}
