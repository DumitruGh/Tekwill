import java.util.Scanner;

public class Main {
    public static int convert(Long val) {
        if (val == null) {
            return 0;
        } else if (Integer.MAX_VALUE < val) {
            return Integer.MAX_VALUE;
        } else if (Integer.MIN_VALUE > val) {
            return Integer.MIN_VALUE;
        } else return val.intValue();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null :
                Long.parseLong(val);
        System.out.println(convert(longVal));
    }
}