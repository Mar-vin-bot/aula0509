package com.exercicio2.exercicio_2.entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user")

public class User {

    @Id
    private String id;
    private String name;
    private String cpf;


    @OneToOne
    private Order order;
    
}
