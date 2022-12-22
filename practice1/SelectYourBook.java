package practice1;

public class SelectYourBook {
    public static void main(String[] args){
        Book book1 = new Book("Lord of the Rings", 500);
        Book book2 = new Book("documentation");
        Book book3 = new Book(100);

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());

        System.out.println(book1.readingTime());
        System.out.println(book2.readingTime());
        System.out.println(book3.readingTime());
    }
}
