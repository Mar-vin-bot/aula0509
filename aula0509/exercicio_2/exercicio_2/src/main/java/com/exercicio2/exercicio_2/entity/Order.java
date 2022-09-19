package com.exercicio2.exercicio_2.entity;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "order")
public class Order {

    @Id
    private String id;
    private Date data;
    private Integer quantify;
    private Double totalPrice;
    
    @OneToOne
    private Product product;

    @OneToOne
    private User user;


}
