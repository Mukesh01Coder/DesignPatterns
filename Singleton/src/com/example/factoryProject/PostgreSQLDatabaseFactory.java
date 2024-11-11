package com.example.factoryProject;

public class PostgreSQLDatabaseFactory extends  DatabaseFactory{

    @Override
    public IDatabase createDatabase()
    {
        return new PostgreSQLDatabase();
    }
}
