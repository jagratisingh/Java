package Aggregation;

public class Book {
    String b_name;
    int price ;
    static Author author;
    static Publisher publisher;
    public  Book(String b_name, int price, Author author, Publisher publisher) {
        this.b_name = b_name;
        this.price = price;
        this.author=author;
        this.publisher=publisher;
    }
    public static void main(String[] args) {
        Book book = new Book("Aca", 300, author, publisher);
        Author author = new Author("Jagrati",450 );
        Publisher publisher = new Publisher("Archana", 340);
        System.out.println(book.b_name+" "+book.price);
        System.out.println(author.a_name +" "+author.price);
        System.out.println(book.b_name+" "+book.price);

        
    }

    
}
