package com.example.multipledb.postgres.service.impl;


import com.example.multipledb.postgres.entity.PostgresTable;
import com.example.multipledb.postgres.repository.PostgresRepository;
import com.example.multipledb.postgres.service.PostgresService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PostgresServiceImpl implements PostgresService {

    private final PostgresRepository postgresRepository;

    public PostgresServiceImpl(PostgresRepository postgresRepository) {
        this.postgresRepository = postgresRepository;
    }

    @Transactional(value= "postgresTransactionManager")
    @Override
    public void save(PostgresTable table) {
        postgresRepository.save(table);
    }
}
