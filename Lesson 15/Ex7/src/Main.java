import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Integer [] arr = {1, 2, 3};
        String [] arr2 = {"one", "two", "three"};
        Integer [] arr3 = {};

        String x = ArrayUtils.info(arr);
        String y = ArrayUtils.info(arr2);
        String z = ArrayUtils.info(arr3);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}