import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number:");
        int first = scanner.nextInt();
        System.out.print("Input the second number:");
        int second = scanner.nextInt();
        System.out.print("Input the third number:");
        int third = scanner.nextInt();

        System.out.println(first != second && second!=third && first != third);
    }
}