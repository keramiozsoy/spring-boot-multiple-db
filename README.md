# spring-boot-multiple-db

An example of how to connect to multiple databases with a Spring Boot application. 

## Technologies
- springboot
- java17
- mssql
- postgres

## Prepare Databases

```SHELL
docker run --name=multiple-db-postgres --env=POSTGRES_PASSWORD=WQqps58o1rt6DrUpJsw2s --env=POSTGRES_USER=postgres -p 5432:5432 -d postgres:12-alpine
```
```SHELL
docker run --name=multiple-db-mssql --env=MSSQL_SA_PASSWORD=WQqps58o1rt6DrUpJsw2 --env=ACCEPT_EULA=Y -p 1433:1433 --restart=no -d mcr.microsoft.com/mssql/server:2022-latest
```


## Send Request
Inserts data to MsSQL

```SHELL
curl http://localhost:9090/mssql
```

Inserts data to PostgreSQL

```SHELL 
curl http://localhost:9090/postgres
```
