package Number4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reader reader = new Reader("Петров В.В");
        String numbersOfBook = scanner.next();
        reader.takeBook(numbersOfBook);
        System.out.println();
        reader.returnBook(numbersOfBook);

        System.out.println();
        String[] booksNames = {"Приключение","Словарь","Энциклопедия"};
        reader.takeBook(booksNames);
        System.out.println();
        reader.returnBook(booksNames);

        System.out.println();
        Book[] booksList = {new Book("Приключение"),new Book("Словарь"),new Book("Энциклопедия")};
        reader.takeBook(booksList);
        System.out.println();
        reader.returnBook(booksList);

    }
}