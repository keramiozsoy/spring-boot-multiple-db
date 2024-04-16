package com.example.multipledb.postgres;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class PostgresEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

}
