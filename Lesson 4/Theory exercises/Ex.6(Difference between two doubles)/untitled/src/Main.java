import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number:");
        double first = scanner.nextDouble();
        System.out.println("Input second number:");
        double second = scanner.nextDouble();

        double difference = second - first;
        System.out.println("difference between second number and first number is:" + difference);

    }
}