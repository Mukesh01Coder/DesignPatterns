package com.example.factoryProject;

public class MySQLDatabaseFactory extends DatabaseFactory {

    @Override
    public IDatabase createDatabase()
    {
        return new MySQLDatabase();
    }
}
