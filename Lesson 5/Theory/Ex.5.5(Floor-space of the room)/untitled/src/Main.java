import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the shape:");
        String shape = scanner.nextLine();

        if (shape.equals("triangle")) {
            System.out.print("Input the first side:");
            double a = scanner.nextDouble();
            System.out.print("Input the second side:");
            double b = scanner.nextDouble();
            System.out.print("Input the third side:");
            double c = scanner.nextDouble();
            System.out.print("The area of the resulting room is:");
            double s = (a + b + c) / 2;
            double Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println(Area);
        } else if (shape.equals("rectangle")) {
            System.out.print("Input the first side:");
            double a = scanner.nextDouble();
            System.out.print("Input the second side:");
            double b = scanner.nextDouble();
            double Area = a * b;
            System.out.println(Area);
        } else if (shape.equals("circle")) {
            System.out.print("Input the radius:");
            double r = scanner.nextDouble();
            double Area = 3.14 * r * r;
            System.out.println(Area);
        }
    }
}