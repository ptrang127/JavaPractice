package ch8_packages_and_interfaces.bookpack;

/**
 * Created by ptran on 6/22/2017.
 */
class Book {
    private String title;
    private String author;
    private int pubDate;

    Book(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}
public class BookDemo {
    public static void main(String args[]) {
        Book books[] = new Book[5];
        books[0] = new Book("Java: A Beginner's Guide", "Schildt", 2014);
        books[1] = new Book("Java: A Beginner's Guide", "Schildt", 2014);
        books[2] = new Book("Java: A Beginner's Guide", "Schildt", 2014);
        books[3] = new Book("Java: A Beginner's Guide", "Schildt", 2014);
        books[4] = new Book("Java: A Beginner's Guide", "Schildt", 2014);

        for(int i = 0; i < books.length; i++) {
            books[i].show();
        }
    }

}
