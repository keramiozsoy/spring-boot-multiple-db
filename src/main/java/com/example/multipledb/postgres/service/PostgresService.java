package com.example.multipledb.postgres.service;

import com.example.multipledb.postgres.entity.PostgresTable;

public interface PostgresService {
    void save(PostgresTable table);
}
