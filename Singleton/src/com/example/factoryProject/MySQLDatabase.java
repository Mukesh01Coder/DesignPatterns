package com.example.factoryProject;
//MySQL Database implementation
public class MySQLDatabase implements IDatabase {
    @Override
   public void connect()
    {
        System.out.println("Connecting to MySQL Database");
    }
}
