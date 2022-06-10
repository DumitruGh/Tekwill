public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.hours = 11;
        clock.minutes = 02;
        clock.next();
        clock.getHours();
        System.out.println("--------");
        clock.hours = 12;
        clock.minutes = 59;
        clock.next();
        clock.getHours();

    }
}