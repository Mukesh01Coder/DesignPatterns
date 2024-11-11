package  com.example.builderProject;

import com.example.project.Database;

public class builder {
    private String host;
    private int port;
    private String username;
    private String password;
    private String dbName;

    private builder(DatabaseBuilder builder)
    {
        this.host = builder.host;
        this.port = builder.port;
        this.username = builder.username;
        this.password = builder.password;
        this.dbName = builder.dbName;
    }

    public  static class DatabaseBuilder {
        private String host;
        private int port;
        private String username;
        private String password;
        private String dbName;

        public DatabaseBuilder setHost(String host) {
            this.host = host;
            return this;
        }

        public DatabaseBuilder setPort(int port) {
            this.port = port;
            return this;
        }

        public DatabaseBuilder setUserName(String username) {
            this.username = username;
            return this;
        }

        public DatabaseBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public DatabaseBuilder setdbName(String dbName) {
            this.dbName = dbName;
            return this;
        }

        public builder build() {
            return new builder(this);
        }
    }
    public  String getUsername()
    {
        return this.username;
    }
}
