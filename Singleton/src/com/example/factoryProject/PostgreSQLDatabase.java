package com.example.factoryProject;
// PostgreSQL Database implementation
public class PostgreSQLDatabase implements IDatabase{
    @Override
    public void connect()
    {
        System.out.println("Connecting to PostgreSQL Database");
    }
}
