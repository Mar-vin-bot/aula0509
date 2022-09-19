package com.exercicio2.exercicio_2.repositorie;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exercicio2.exercicio_2.entity.Product;

public interface ProductRepositorie extends MongoRepository<Product, String> {
    
}
