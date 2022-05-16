import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number:");
         int i = scanner.nextInt();
         System.out.println("The number of tens is:" + (i - (i / 100) * 100) / 10);


       //Varianta pe lung

       /* System.out.print("Input the number:");
        int number = scanner.nextInt();

        if (number < 10 && number >= 0) {
            int a = number / 10;
            System.out.println("Number of tens is:" + a);
        } else if (number >= 10 && number < 100) {
            int b = number / 10;
            System.out.println("Number of tens is:" + b);
        } else if (number >= 100 && number < 1000) {
            int c = (number % 100) / 10;
            System.out.println("Number of tens is:" + c);
        } else if (number >= 1000 && number < 10000) {
            int d = ((number % 1000) % 100) / 10;
            System.out.println("Number of tens is:" + d);
        } else if (number >= 10000 && number < 100000) {
            int e = (((number % 10000) % 1000) % 100) / 10;
            System.out.println("Number of tens is:" + e);
        } else if (number >= 100000 && number < 1000000) {
            int f = ((((number % 100000) % 10000) % 1000) % 100) / 10;
            System.out.println("Number of tens is:" + f);
        } else if (number == 1000000) {
            int g = number % 1000000;
            System.out.println("Number of tens is:" + g);

        }*/

    }
}