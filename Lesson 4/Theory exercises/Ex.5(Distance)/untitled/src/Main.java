import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Input the distance between two cities:");
        int distance = scanner.nextInt();
        System.out.print("Input the travel time:");
        int time = scanner.nextInt();

        double averageSpeed = distance/time;
        System.out.println("average speed is:" + averageSpeed + "km/h");

    }
}