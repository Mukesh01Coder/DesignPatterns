package com.example.project;
public class Logger { // Logger - Manages application logging.
    // Thread-safe singleton
    private  static Logger instance = null;

    private Logger()
    {

    }

    public static synchronized Logger getInstance() // Synchronized prevent the multiple thread to enter
    {
        if(instance == null)
        {
            instance = new Logger(); // Lazy Initialization
        }
        return instance;
    }

    public  static  void LoggerConnection()
    {
        System.out.println("Connected with Logger class !");
    }
}
