import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the string:");
        String str = scanner.next();

        String[] s = str.split("");
        String reverse = "";
        for (int i = s.length - 1; i >= 0; i--) {
            reverse += s[i];

        }
        System.out.print(reverse);
        System.out.println(" ");

        System.out.println(str.equals(reverse));
    }
}