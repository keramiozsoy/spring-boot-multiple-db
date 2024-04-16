package com.example.multipledb.postgres;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostgresRepository extends JpaRepository<PostgresEntity, Long> {
}
