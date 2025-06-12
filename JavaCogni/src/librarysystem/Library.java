package librarysystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();

    public void showAllBooks() {
        for (Book b : books) {
            b.displayDetails();
        }
    }

    public Book findBookById(int id) {
        for (Book b : books) {
            if (b.id == id) return b;
        }
        return null;
    }
}
