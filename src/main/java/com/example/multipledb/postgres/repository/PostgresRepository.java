package com.example.multipledb.postgres.repository;

import com.example.multipledb.postgres.entity.PostgresTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostgresRepository extends CrudRepository<PostgresTable, Long> {
}