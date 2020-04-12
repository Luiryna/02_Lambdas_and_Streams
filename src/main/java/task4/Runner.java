package task4;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {

        Author author1 = new Author("name1", (short) 45);
        Author author2 = new Author("name2", (short) 23);
        Author author3 = new Author("name3", (short) 34);
        Author author4 = new Author("name4", (short) 18);

        Book book1 = new Book("title1", Collections.singletonList(author1),234);
        Book book2 = new Book("title2", Arrays.asList(author1, author2), 456);
        Book book3 = new Book("title3", Collections.singletonList(author3), 834);
        Book book4 = new Book("title4", Arrays.asList(author2, author4), 123);

        author1.addBook(book1);
        author1.addBook(book2);
        author2.addBook(book2);
        author2.addBook(book4);
        author3.addBook(book3);
        author4.addBook(book4);

        Book[] books = {book1, book2, book3, book4};
        Author[] authors = {author1, author2, author3, author4};

        System.out.println("print all book(s) have more than 200 pages: ");
        Arrays.stream(books)
                .filter(p -> p.getNumberOfPages() > 200)
                .forEach(System.out::println);

        System.out.println("print books with max and min number of pages");
        Arrays.stream(books)
                .max(Comparator.comparing(Book::getNumberOfPages))
                .ifPresent(System.out::println);

        System.out.println();

        Arrays.stream(books)
                .min(Comparator.comparing(Book::getNumberOfPages))
                .ifPresent(System.out::println);

        System.out.println("print books with only single author");
        Arrays.stream(books)
                .parallel()
                .filter(p -> p.getAuthors().size() == 1)
                .forEach(System.out::println);

        System.out.println("print books by number of pages/title");
        Arrays.stream(books)
                .sorted(Comparator.comparing(Book::getNumberOfPages))
                .forEach(System.out::println);

        System.out.println();

        Arrays.stream(books)
                .sorted(Comparator.comparing(Book::getTitle))
                .forEach(System.out::println);

        System.out.println("print list of all titles");
        Arrays.stream(books)
                .map(Book::getTitle)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("print list of all authors");
        

    }
}
