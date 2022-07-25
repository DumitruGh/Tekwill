public class Main {
    public static void main(String[] args) {

        Holder<String> holder = new Holder<>();
        holder.set("This is an instance of a string");
        String value = holder.get();
        System.out.println(value);
    }
}