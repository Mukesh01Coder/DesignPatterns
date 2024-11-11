package com.example.project;
public class ConfigurationManager { //ConfigurationManager - Manages configuration settings.

    // Double-Checked Locking
    private static volatile ConfigurationManager instance = null;

    private  ConfigurationManager()
    {

    }

    public static ConfigurationManager getInstance()
    {
        if(instance == null) // checking without acquiring the lock
        {
            synchronized (ConfigurationManager.class)
            {
                if(instance == null) // check after acquiring the lock
                {
                    instance = new ConfigurationManager();
                }
            }
        }

        return instance;
    }

    public  static void CMConnection()
    {
        System.out.println("Connected with ConfigurationManager Class !");
    }
}
