package com.example.multipledb.mssql.service;

import com.example.multipledb.mssql.entity.MssqlTable;

public interface MssqlService {
    void save(MssqlTable table);
}
