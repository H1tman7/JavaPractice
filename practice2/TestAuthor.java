package practice2;

public class TestAuthor {
    public static void main(String[] args){

        Author man = new Author("Duglas Adams", "dAdams@gmail.com", 'm');
        Author woman = new Author("J. K. Rowling", "info@jkrowling.com", 'w');

        System.out.println(man.toString());
        System.out.println(woman.toString());


    }
}
