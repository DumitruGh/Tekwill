import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first string:");
        String first = scanner.nextLine();

        for (int i = 0; i < first.length(); i++) {
            String second = "" + first.charAt(i);
            if (first.charAt(i) == 'a') {
                second = "" + 'b';
            }
            System.out.print(second);
        }
    }
}