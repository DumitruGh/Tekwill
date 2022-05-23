import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the string:");
        String str = scanner.nextLine();

        if (str.charAt(0) == 'J' || str.charAt(0) == 'j') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}