import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the name of the house:");
        String house = scanner.nextLine();

        switch (house) {
            case "gryffindor" -> System.out.println("bravery");
            case "hufflepuff" -> System.out.println("loyalty");
            case "slytherin" -> System.out.println("cunning");
            case "ravenclaw" -> System.out.println("intellect");
            default -> System.out.println("not a valid house");
        }
    }
}