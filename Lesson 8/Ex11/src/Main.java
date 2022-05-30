import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number:");
        double a = scanner.nextDouble();
        System.out.print("Input n power:");
        long n = scanner.nextLong();
        System.out.println(power(a, n));
    }

    public static double power(double a, long n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            return power(a * a, n / 2);
        } else {
            return power(a, n - 1) * a;
        }
    }
}