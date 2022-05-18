import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the string:");
        String str = scanner.nextLine();
        System.out.print("Input beginIndex:");
        int x = scanner.nextInt();
        System.out.print("Input endIndex:");
        int y = scanner.nextInt();
        String str2 = str.substring(x,y+1);
        System.out.println(str2);

    }
}