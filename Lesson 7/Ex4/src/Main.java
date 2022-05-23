import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the date:");
        String x = scanner.nextLine();

        String[] y = x.split("-");

        String y1 = y[0];
        String y2 = y[1];
        String y3 = y[2];

        System.out.println(y2 + "/" + y3 +"/" +y1);
    }
}