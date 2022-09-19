package com.example2_1.Log.controller;

import com.example2_1.Log.entity.Log;
import com.example2_1.Log.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/log")
public class LogController {

    @Autowired
    private LogService controller;

    @PostMapping
    public Log create(@RequestBody Log obj) {
        return controller.create(obj);
    }
    
}
