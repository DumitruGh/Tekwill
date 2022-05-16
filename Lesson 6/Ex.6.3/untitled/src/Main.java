import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();

        }

        System.out.print("Input number n:");
        int n = scanner.nextInt();
        int sum = 0;
        for (int x = 0; x < size; x++) {
            if (array[x] > n) {
                sum = sum + array[x];
            }
        }
        System.out.println(sum);
    }
}