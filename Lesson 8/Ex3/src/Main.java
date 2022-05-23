import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }

    public static long factorial(long n){
        long y = 1;
        for(long x = 1; x<=n;x++){
            y= y*x;
        }
        return y;
    }
}