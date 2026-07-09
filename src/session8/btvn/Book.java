package session8.btvn;

import java.util.Scanner;

public class Book {
    String title;
    String author;
    double price;
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public static void main(String args[]) {
        Book book1 = new Book("Book 1", "A", 15);
        System.out.println("Title: " + book1.title + ", Author: " + book1.author + ", Price: " + book1.price);
    }
}
