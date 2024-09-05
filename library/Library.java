package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(String isbn) {
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                if (!book.isIssued()) {
                    book.setIssued(true);
                    System.out.println("Book issued successfully.");
                } else {
                    System.out.println("Book is already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                if (book.isIssued()) {
                    book.setIssued(false);
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("This book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty, Add some books by choosing option 4.");
        }
        else{
            for (Book book : books) {
               System.out.println(book);
        }
    }
    }
}

