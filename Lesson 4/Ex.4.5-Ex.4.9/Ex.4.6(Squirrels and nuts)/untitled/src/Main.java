import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of squirrels N:");
        int N = scanner.nextInt();
        System.out.println("Input the number of nuts K:");
        int K = scanner.nextInt();

        int leftNuts = K % N;
        if(K>0 && K <= 10000 && N>0 && N<10000 & K>N){
            System.out.println("the number of left nuts is: " + leftNuts);
        }
        else{
            System.out.println("fatal error");
        }
    }
}