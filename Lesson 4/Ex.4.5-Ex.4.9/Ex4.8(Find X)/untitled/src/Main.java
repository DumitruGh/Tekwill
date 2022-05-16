    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double y = 0;
            System.out.println("Input a:");
            double a = scanner.nextDouble();
            System.out.println("Input b:");
            double b = scanner.nextDouble();
            System.out.println("Input c:");
            double c = scanner.nextDouble();

            double x = (c-b)/a;
            if( a != y ){
                System.out.println(x);
            }

        }
    }