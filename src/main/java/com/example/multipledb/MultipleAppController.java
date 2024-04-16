package com.example.multipledb;

import com.example.multipledb.postgres.entities.PostgresEntity;
import com.example.multipledb.postgres.PostgresServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MultipleAppController {

    private final PostgresServiceImpl postgresService;

    @GetMapping("/postgres")
    public String getPostgres() {
        postgresService.save(PostgresEntity.builder().name("test").build());
        return "Success";
    }

    @GetMapping("/mssql")
    public String getMssql() {
        return "Mssql";
    }

}
