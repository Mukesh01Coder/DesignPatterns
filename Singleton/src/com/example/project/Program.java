public class Program {
    public static void main(String[] args) {
       //The singleton pattern is a software design pattern that restricts the instantiation of a class to one object.
        // This is useful when exactly one object is needed to coordinate actions across the system.

        Database dbInstance =  Database.getInstance();
        dbInstance.DBconnection();

        Logger loggerInstance = Logger.getInstance();
        loggerInstance.LoggerConnection();

        ConfigurationManager CMinstance = ConfigurationManager.getInstance();
        CMinstance.CMConnection();
    }
}
