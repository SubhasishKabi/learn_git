package librarysystem;

public class Book {
    int id;
    String title;
    String author;
    boolean isAvailable;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void displayDetails() {
        System.out.println(id + ": " + title + " by " + author + " - " + (isAvailable ? "Available" : "Issued"));
    }
}
