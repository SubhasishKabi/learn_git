package pratice.codes;

public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPrice: ₹" + price + "\n";
    }

    public static void main(String[] args) {
        Book[] books = {
                new Book("Atomic Habits", "James Clear", 499.0),
                new Book("Clean Code", "Robert C. Martin", 599.0),
                new Book("Wings of Fire", "A.P.J. Abdul Kalam", 350.0)
        };

        for (Book b : books) {
            System.out.println(b);
        }
    }
}
