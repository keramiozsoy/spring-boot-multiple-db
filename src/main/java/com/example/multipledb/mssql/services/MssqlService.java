package com.example.multipledb.mssql.services;

import com.example.multipledb.mssql.entities.MssqlEntity;

public interface MssqlService {
    void save(MssqlEntity entity);
}
