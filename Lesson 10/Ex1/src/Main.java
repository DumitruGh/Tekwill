public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int i1 = counter.inc();
        System.out.println(i1);
        int i2= counter.inc();
        System.out.println(i2);
        System.out.println(counter.getCurrent());
    }
}