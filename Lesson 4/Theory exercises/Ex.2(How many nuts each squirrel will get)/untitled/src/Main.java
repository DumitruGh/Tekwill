import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of squirrels N:");
        int N = scanner.nextInt();
        System.out.println("Input the number of nuts K:");
        int K = scanner.nextInt();

        int result = K/N;

       if(N<=10000 && N>0 && K<=10000 &&K>0){
           System.out.println("result is:" + result);
       }
       else{
           System.out.println("fatal error");
       }
    }
}