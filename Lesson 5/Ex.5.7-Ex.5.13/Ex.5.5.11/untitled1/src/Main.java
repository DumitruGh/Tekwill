import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of elements:");
        int n = scanner.nextInt();

        int sum = 0;
        for (int z = 0; z < n; z++) {
            int temp = scanner.nextInt();
            if (temp % 6 == 0) {
                sum = sum + temp;
            }
        }
        System.out.println(sum);
    }
}