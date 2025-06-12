package librarysystem;

public class Librarian extends User {
    public Librarian(int id, String name) {
        super(id, name);
    }

    public void addBook(Library lib, Book book) {
        lib.books.add(book);
        System.out.println("Book added: " + book.title);
    }
}
