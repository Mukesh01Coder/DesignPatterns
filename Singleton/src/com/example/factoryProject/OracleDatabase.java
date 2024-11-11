package com.example.factoryProject;
// Oracle Database implementation
public class OracleDatabase implements IDatabase {

    @Override
    public void connect()
    {
        System.out.println("Connecting to Oracle Database");
    }
}
