import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number:");
        int first = scanner.nextInt();
        System.out.println("Input second number:");
        int second = scanner.nextInt();
        System.out.println("Input third number:");
        int third = scanner.nextInt();

        System.out.println((first > 0 && second <=0 && third <=0) ||
                (first <= 0 &&second >0 && third <=0)|| (first <=0 && second <=0 && third >0));

    }
}