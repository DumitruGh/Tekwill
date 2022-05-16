import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of direction:");
        int number = scanner.nextInt();

        switch(number){
            case 0 -> System.out.println("do not move");
            case 1 -> System.out.println("move up");
            case 2 -> System.out.println("move down");
            case 3 -> System.out.println("move left");
            case 4 -> System.out.println("move right");
            default -> System.out.println("error!");
        }

    }
}