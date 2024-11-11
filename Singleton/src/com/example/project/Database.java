public class Database {// Database - Manages database connections.
   //Simple Singleton
    private static final Database instance = new Database();// Eager Initialization

    private Database()
    {

    }

    public static Database getInstance()
    {
        return instance;
    }

    public void DBconnection()
    {
        System.out.println("Connected to the database class !");
    }

//    //Thread-Safe  Singleton
//    private static Database instance = null;
//
//    private Database()
//    {
//
//    }
//
//    public static synchronized Database getInstance() { // Synchronized for thread safety
//        if (instance == null) {
//            instance = new Database();// Lazy Initialization;
//        }
//        return instance;
//    }

//    //Double-Checked  Locking
//    private static volatile Database instance = null; // Volatile to prevent caching issues
//
//    private Database()
//    {
//
//    }
//
//    public static Database getInstance()
//    {
//        if(instance == null)// First check without locking
//        {
//            synchronized (Database.class)
//            {
//                if(instance == null) // second check within synchronized block;
//                {
//                    instance = new Database();
//                }
//            }
//        }
//        return instance;
//    }
}
