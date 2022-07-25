public class Main {
    public static void main(String[] args) {

        Printer<String> printer = new Printer<>();
        printer.set("value");
        printer.print();
    }
}