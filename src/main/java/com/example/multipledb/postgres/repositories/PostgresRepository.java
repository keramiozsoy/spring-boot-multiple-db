package com.example.multipledb.postgres.repositories;

import com.example.multipledb.postgres.entities.PostgresEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostgresRepository extends JpaRepository<PostgresEntity, Long> {
}
