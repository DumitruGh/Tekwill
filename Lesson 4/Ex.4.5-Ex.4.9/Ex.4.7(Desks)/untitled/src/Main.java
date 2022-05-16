import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of students in the first group:");
        int first = scanner.nextInt();
        System.out.print("Input the number of students in the second group:");
        int second = scanner.nextInt();
        System.out.print("Input the number of students in the third group:");
        int third = scanner.nextInt();

        int desksFirstClass = first/2;
        if(desksFirstClass % 2 !=0){
            desksFirstClass++;
        }
        int desksSecondClass = second/2;
        if(desksSecondClass % 2 !=0) {
            desksSecondClass++;
        }
        int desksThirdClass = third/2;
        if(desksThirdClass % 2 !=0) {
            desksThirdClass++;
        }

        int result = desksFirstClass+desksSecondClass+desksThirdClass;
        if( desksFirstClass <= 1000 && desksFirstClass>0 && desksSecondClass <= 1000 && desksSecondClass>0
         && desksThirdClass <= 1000 && desksThirdClass>0){
            System.out.println("the number of minimum desks is:" +  result);
        }


    }
}