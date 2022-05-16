import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number:");
        long first = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Operation:");
        String z = scanner.nextLine();
        System.out.print("Input the second number:");
        long second = scanner.nextLong();


        switch (z) {
            case "+" -> System.out.println(first + second);
            case "-" -> System.out.println(first - second);
            case "*" -> System.out.println(first * second);
            case "/" -> {
                if (second == 0) {
                    System.out.println("Divided by 0");
                } else {
                    System.out.println(first / second);
                }
            }
            default -> System.out.println("Unknown operator");
        }
    }
}
