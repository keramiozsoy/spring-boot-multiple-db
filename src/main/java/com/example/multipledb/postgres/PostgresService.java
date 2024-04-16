package com.example.multipledb.postgres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostgresService {

    private final PostgresRepository postgresRepository;

    @Autowired
    public PostgresService(PostgresRepository postgresRepository) {
        this.postgresRepository = postgresRepository;
    }
}
