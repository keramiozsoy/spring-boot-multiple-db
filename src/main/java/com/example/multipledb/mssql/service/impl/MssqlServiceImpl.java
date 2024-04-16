package com.example.multipledb.mssql.service.impl;

import com.example.multipledb.mssql.entity.MssqlTable;
import com.example.multipledb.mssql.repository.MssqlRepository;
import com.example.multipledb.mssql.service.MssqlService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MssqlServiceImpl implements MssqlService {

    private final MssqlRepository mssqlRepository;

    public MssqlServiceImpl(MssqlRepository mssqlRepository) {
        this.mssqlRepository = mssqlRepository;
    }


    @Transactional(value= "mssqlTransactionManager")
    @Override
    public void save(MssqlTable table) {
        mssqlRepository.save(table);
    }
}
