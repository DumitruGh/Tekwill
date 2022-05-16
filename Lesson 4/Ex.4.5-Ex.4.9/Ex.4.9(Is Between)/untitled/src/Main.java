import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number:");
        int first = scanner.nextInt();
        System.out.print("Input second number:");
        int second = scanner.nextInt();
        System.out.print("Input third number:");
        int third = scanner.nextInt();

        if(first<=third && first>=second){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}