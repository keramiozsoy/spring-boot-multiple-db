package com.example.multipledb.mssql.entities;


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
public class MssqlEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

}
