package com.example.multipledb.controllers;

import com.example.multipledb.mssql.entities.MssqlEntity;
import com.example.multipledb.mssql.services.MssqlServiceImpl;
import com.example.multipledb.postgres.entities.PostgresEntity;
import com.example.multipledb.postgres.services.PostgresServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MultipleAppController {

    private final PostgresServiceImpl postgresService;
    private final MssqlServiceImpl mssqlService;

    @GetMapping("/postgres")
    public String getPostgres() {
        postgresService.save(PostgresEntity.builder().name("postgrestest").build());
        return "Postgres Success";
    }

    @GetMapping("/mssql")
    public String getMssql() {
        mssqlService.save(MssqlEntity.builder().name("mssqltest").build());
        return "Mssql Success";
    }

}
