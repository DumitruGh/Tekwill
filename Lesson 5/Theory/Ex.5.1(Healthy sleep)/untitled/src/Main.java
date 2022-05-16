import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input A:");
        double A = scanner.nextDouble();
        System.out.print("Input B:");
        double B = scanner.nextDouble();
        System.out.print("Input H:");
        double H = scanner.nextDouble();

        if (H < A) {
            System.out.println("Deficiency");
        } else if (H > B) {
            System.out.println("Excess");
        } else if (H >= A && H <= B) {
            System.out.println("Normal");
        }


    }
}