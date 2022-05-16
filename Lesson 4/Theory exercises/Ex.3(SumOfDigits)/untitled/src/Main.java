import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number:");
        int number = scanner.nextInt();

        int x = number/100;
        int y = number % 100;
        int z = y/10;
        int w = y%10;

        int result = x + z + w;
        System.out.println("Sum of digits is:" + result);

    }
}