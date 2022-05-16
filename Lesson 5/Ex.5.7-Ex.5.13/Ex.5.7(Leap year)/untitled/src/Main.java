import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number:");
        int number = scanner.nextInt();

        if(number%400==0 || number % 4==0 && number % 100 != 0){
            System.out.println("Leap");
        }else{
            System.out.println("Regular");
        }



    }
}

