import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the name of the city:");
        String city = scanner.nextLine();

        if (city.charAt(city.length() - 1) == 'g' &&
                city.charAt(city.length() - 2) == 'r' &&
                city.charAt(city.length() - 3) == 'u' &&
                city.charAt(city.length() - 4) == 'b') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}