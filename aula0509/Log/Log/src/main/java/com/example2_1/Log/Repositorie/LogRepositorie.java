package com.example2_1.Log.Repositorie;

import org.springframework.data.mongodb.core.MongoAdminOperations;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example2_1.Log.entity.Log;

public interface LogRepositorie extends MongoRepository <Log, String> {
    
}
