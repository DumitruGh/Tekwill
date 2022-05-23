public class Main {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'Z';
        String temp = "";
        for (char x = a; x <= b; x++) {
            temp = temp + " " + x;
        }
        StringBuilder alpha = new StringBuilder(temp);
        System.out.println(alpha);
    }
}