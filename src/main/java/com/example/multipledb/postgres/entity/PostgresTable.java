package com.example.multipledb.postgres.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class PostgresTable {

    @Id
    @GeneratedValue
    private Long id;

    private String value;
}
