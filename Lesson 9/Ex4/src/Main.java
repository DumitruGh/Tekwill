import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] array = new int[10];
        System.out.print("Input the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(java.util.Arrays.toString(array));

        System.out.print("Input the number to find the position of:");
        int x = scanner.nextInt();
        System.out.println(java.util.Arrays.binarySearch(array, x));
    }
}