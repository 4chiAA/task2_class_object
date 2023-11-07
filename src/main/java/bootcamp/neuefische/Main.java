package bootcamp.neuefische;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("DENKE! ANDERS: Das wohl wertvollste Buch der Welt", "Andreas Boskugel", "9783981537796");
        Book book2 = new Book("Nur noch ein einziges Mal", "Colleen Hoover", "B074P5TWCX");
        Book book3 = new Book("Die Familie gegenüber: Ein unfassbar fesselnder Psychothriller", "Nicole Trope", "B0BZ4P6C1Q");

        Book[] book = new Book[3];
        book[0] = book1;
        book[1] = book2;
        book[2] = book3;

        Library library1 = new Library(book);

        System.out.println(library1);
    }
}