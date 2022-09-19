package com.exercicio2.exercicio_2.entity;


import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "product")

public class Product {

    @Id
    private String id;
    private String name;
    private Integer product_code;
    private String manufacture;
    private Double price;
    
}
