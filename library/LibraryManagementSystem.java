package library;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("\nLibrary Management System:");
            System.out.println("1. Show all books");
            System.out.println("2. Issue a book");
            System.out.println("3. Return a book");
            System.out.println("4. Add new book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    library.showAllBooks();
                    break;
                case 2:
                    System.out.print("Enter the ISBN of the book to issue: ");
                    String issueISBN = scanner.nextLine();
                    library.issueBook(issueISBN);
                    break;
                case 3:
                    System.out.print("Enter the ISBN of the book to return: ");
                    String returnISBN = scanner.nextLine();
                    library.returnBook(returnISBN);
                    break;
                case 4:
                    System.out.print("Enter the book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter the book ISBN: ");
                    String ISBN = scanner.nextLine();
                    library.addBook(new Book(title, author, ISBN));
                    System.out.println("Book added successfully.");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
            System.out.println("\nPress Enter to go back to the menu...");
            scanner.nextLine();
        }
    }
}
