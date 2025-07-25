package designPatterns.singleton;

public final class DBConnection {
    private final String username;
    private final String password;

    private static DBConnection dbInstance = null;

    private DBConnection(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static DBConnection getInstance(String username, String password) {
        if (dbInstance == null) {
            synchronized (DBConnection.class) {
                if (dbInstance == null) {
                    dbInstance = new DBConnection(username, password);
                }
            }
        }
        return dbInstance;
    }

    public String getUsername() {
        return username;
    }
}
