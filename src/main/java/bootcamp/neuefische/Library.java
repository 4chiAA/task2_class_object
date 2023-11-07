package bootcamp.neuefische;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library(){

    }

    public Library(Book[] books){
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "Books: " + Arrays.toString(books) +
                '}';
    }
}
