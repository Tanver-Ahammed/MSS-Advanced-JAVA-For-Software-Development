package set.basic.book;

import java.util.HashSet;
import java.util.Set;

public class BookHashSet {
    public void setBooks() {

        Set<Book> books = new HashSet<>();

        books.add(new Book(101,"Programming with C","E Blalgurusami"));
        books.add(new Book(102,"OOP with C++","E Blalgurusami"));
        books.add(new Book(103,"OOP with JAVA","E Blalgurusami"));
        books.add(new Book(104,"Programming with Python","E Blalgurusami"));
        books.add(new Book(105,"Programming with Kotlin","E Blalgurusami"));

        System.out.println(books);

        System.out.println(books.contains(new Book(105,"Programming with Kotlin","E Blalgurusami")));
    }
}
