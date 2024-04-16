package com.example.multipledb.mssql.repositories;

import com.example.multipledb.mssql.entities.MssqlEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MssqlRepository extends JpaRepository<MssqlEntity, Long> {
}
