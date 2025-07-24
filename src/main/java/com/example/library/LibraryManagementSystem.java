package com.example.library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    static ArrayList<String> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    borrowBook();
                    break;
                case 5:
                    returnBook();
                    break;
                case 6:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }

    static void addBook() {
        System.out.print("Enter book title: ");
        String book = sc.nextLine();
        books.add(book);
        System.out.println("Book added successfully.");
    }

    static void viewBooks() {
        System.out.println("\n--- Available Books ---");
        for (String book : books) {
            System.out.println(book);
        }
    }

    static void searchBook() {
        System.out.print("Enter book title to search: ");
        String title = sc.nextLine();
        if (books.contains(title)) {
            System.out.println("Book found!");
        } else {
            System.out.println("Book not found.");
        }
    }

    static void borrowBook() {
        System.out.print("Enter book title to borrow: ");
        String title = sc.nextLine();
        if (books.remove(title)) {
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book not available.");
        }
    }

    static void returnBook() {
        System.out.print("Enter book title to return: ");
        String title = sc.nextLine();
        books.add(title);
        System.out.println("Book returned successfully.");
    }
}