package com.example.multipledb.postgres;


import com.example.multipledb.postgres.entities.PostgresEntity;
import com.example.multipledb.postgres.repositories.PostgresRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostgresServiceImpl implements PostgresService {
    private final PostgresRepository postgresRepository;

    @Override
    public void save(PostgresEntity entity){
        postgresRepository.save(entity);
    }

}
