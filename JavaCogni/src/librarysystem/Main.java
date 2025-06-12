package librarysystem;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Librarian librarian = new Librarian(101, "Mrs. Meena");
        Student student = new Student(201, "Subhasish");

        librarian.addBook(library, new Book(1, "Java Basics", "James Gosling"));
        librarian.addBook(library, new Book(2, "OOP Concepts", "Grady Booch"));

        System.out.println("\nAvailable Books:");
        library.showAllBooks();

        Book bookToBorrow = library.findBookById(1);
        if (bookToBorrow != null) {
            student.borrowBook(bookToBorrow);
        }

        System.out.println("\nAfter Borrowing:");
        library.showAllBooks();
    }
}
