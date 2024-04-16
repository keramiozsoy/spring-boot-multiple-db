package com.example.multipledb.postgres;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PostgresDataSourceConfig {

    @Bean
    @ConfigurationProperties(prefix = "postgres.datasource")
    public DataSource postgresDataSource() {
        return DataSourceBuilder.create().build();
    }
}