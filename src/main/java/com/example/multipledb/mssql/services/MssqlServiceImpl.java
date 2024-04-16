package com.example.multipledb.mssql.services;


import com.example.multipledb.mssql.entities.MssqlEntity;
import com.example.multipledb.mssql.repositories.MssqlRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MssqlServiceImpl implements MssqlService {
    private final MssqlRepository mssqlRepository;

    @Override
    public void save(MssqlEntity entity){
        mssqlRepository.save(entity);
    }

}
