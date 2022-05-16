import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first side:");
        int A = scanner.nextInt();
        System.out.print("Input the second side:");
        int B = scanner.nextInt();
        System.out.print("Input the third side:");
        int C = scanner.nextInt();

        if (A + B > C && A + C > B && B + C > A) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

