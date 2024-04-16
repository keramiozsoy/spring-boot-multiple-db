package com.example.multipledb.postgres.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Entity
@Getter
@Setter
public class PostgresEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

}
