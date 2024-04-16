package com.example.multipledb.mssql.repository;

import com.example.multipledb.mssql.entity.MssqlTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MssqlRepository extends CrudRepository<MssqlTable, Long> {
}
