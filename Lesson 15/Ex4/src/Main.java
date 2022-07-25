public class Main {
    public static void main(String[] args) {
        Holder holder = new Holder();
        holder.set(256);

        Integer value = (Integer)holder.get();
        System.out.println(value);
    }
}