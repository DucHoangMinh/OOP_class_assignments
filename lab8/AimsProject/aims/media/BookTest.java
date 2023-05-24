package aims.media;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("This is a test. This is only a test.");
        System.out.println(book);
        // Test changing the content
        book.setContent("Another test.");
        System.out.println(book);
    }
}
