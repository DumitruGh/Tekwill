import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number:");
        int x = scanner.nextInt();

        System.out.println(x<10 &&x>0);
    }
}