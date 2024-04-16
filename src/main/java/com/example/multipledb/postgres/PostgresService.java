package com.example.multipledb.postgres;

import com.example.multipledb.postgres.entities.PostgresEntity;

public interface PostgresService {
    void save(PostgresEntity entity);
}
