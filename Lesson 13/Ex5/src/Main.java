import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] authors = {"Tolstoi", "Dostoievski"};
       Books books = new Books("Beauty and the Beast", 2019, authors);
        System.out.println(books);

    }
}