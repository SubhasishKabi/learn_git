package librarysystem;

public class User {
    int userId;
    String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public void displayUser() {
        System.out.println(userId + ": " + name);
    }
}
