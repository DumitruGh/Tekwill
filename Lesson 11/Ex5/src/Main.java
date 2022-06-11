import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        Secret[] array = Secret.values();
        System.out.println(Arrays.toString(array));
        for (Secret s : array) {
            if (s.name().startsWith("STAR")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}