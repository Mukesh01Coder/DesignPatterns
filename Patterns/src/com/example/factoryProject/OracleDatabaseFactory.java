package com.example.factoryProject;

public class OracleDatabaseFactory extends DatabaseFactory{

    @Override
    public IDatabase createDatabase()
    {
        return new OracleDatabase();
    }
}
