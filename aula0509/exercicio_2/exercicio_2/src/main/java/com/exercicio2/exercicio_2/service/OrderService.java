package com.exercicio2.exercicio_2.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

import com.exercicio2.exercicio_2.entity.Order;
import com.exercicio2.exercicio_2.repositorie.OrderRepositorie;

public class OrderService {

    @Autowired
    private OrderRepositorie repositorie;

    public List<Order> findAll(){
        return repositorie.findAll();
    }

    public Order create(Order obj) {
        return repositorie.save(obj);
    }

    public Optional<Order> findById(String id) {
        return repositorie.findById(id);
    }

    public Order update(Order obj, String id) {
        obj.setId(id);
        return repositorie.save(obj);
    }

    public void delete(@PathVariable String id) {
        repositorie.deleteById(id);
    }





    
    
}
