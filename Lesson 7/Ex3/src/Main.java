import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first string:");
        String str1 = scanner.nextLine();
        System.out.print("Input the second string:");
        String str2 = scanner.nextLine();

        String str1replace = str1.replace(" ", "");
        String str2replace = str2.replace(" ", "");

        System.out.println(str1replace.equals(str2replace));

    }
}