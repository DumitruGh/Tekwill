import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number:");
        int x = scanner.nextInt();


        int i1 = x / 1000;
        int i2 = (x % 1000) / 100;
        int w = (x % 1000) % 100;
        int i3 = w / 10;
        int i4 = x % 10;

        if (i1 == i4 && i2 == i3) {
            System.out.println("1");
        } else {
            System.out.println(Math.random());
        }


    }
}
