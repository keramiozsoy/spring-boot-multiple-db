package com.example.multipledb.mssql.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class MssqlTable {

    @Id
    @GeneratedValue
    private Long id;

    private String value;
}