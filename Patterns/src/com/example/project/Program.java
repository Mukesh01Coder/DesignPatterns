//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.project;

import com.example.builderProject.builder;
import com.example.factoryProject.*;


public class Program {

    public static void main(String[] args) {

        //singleton design pattern
        Database dbInstance = Database.getInstance();
        dbInstance.DBconnection();
        Logger loggerInstance = Logger.getInstance();
        Logger.LoggerConnection();
        ConfigurationManager CMinstance = ConfigurationManager.getInstance();
        ConfigurationManager.CMConnection();


        //builder design pattern
        builder db = new builder.DatabaseBuilder()
                .setHost("localhost")
                .setPort(5080)
                .setUserName("admin")
                .setPassword("password")
                .setdbName("MyDatabase")
                .build();

        System.out.println(db.getUsername());

        //Factory Design Pattern

        //MySqlDatabaseFactory
        DatabaseFactory mySqlFactory = new MySQLDatabaseFactory();

        IDatabase mySqlDB = mySqlFactory.createDatabase();
        mySqlDB.connect();

        //OracleDatabaseFactory
        DatabaseFactory oracleFactory = new OracleDatabaseFactory();

        IDatabase oracleDB = oracleFactory.createDatabase();
        oracleDB.connect();

        //PostgreSQLDatabaseFactory
        DatabaseFactory postgreSqlFactory = new PostgreSQLDatabaseFactory();

        IDatabase postgreSqlDB = postgreSqlFactory.createDatabase();
        postgreSqlDB.connect();
    }
}
