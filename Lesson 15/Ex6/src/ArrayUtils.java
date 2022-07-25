public class ArrayUtils {

    public static <T> boolean hasNull(T[] array) {
        for (T element : array) {
            if (element == null) {
                return true;
            }
        }
        return false;
    }
}

