public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author , double price ) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Book book = new Book("love","kk",20.5);
        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.price);
    }

}
