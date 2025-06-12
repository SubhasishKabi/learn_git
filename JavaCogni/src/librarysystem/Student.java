package librarysystem;

public class Student extends User {
    public Student(int id, String name) {
        super(id, name);
    }

    public void borrowBook(Book book) {
        if (book.isAvailable) {
            book.isAvailable = false;
            System.out.println(name + " borrowed \"" + book.title + "\"");
        } else {
            System.out.println("Book is not available.");
        }
    }
}
