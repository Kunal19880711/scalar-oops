package designPatterns.singleton;

public class Client {
    public static void main(String[] args) {
        DBConnection db1 = DBConnection.getInstance("user1", "pass1");
        System.out.println("DB1 Username: " + db1.getUsername());

        DBConnection db2 = DBConnection.getInstance("user2", "pass2");
        System.out.println("DB2 Username: " + db2.getUsername());

        // Both db1 and db2 should refer to the same instance
        System.out.println("Are both instances the same? " + (db1 == db2));
    }
}
