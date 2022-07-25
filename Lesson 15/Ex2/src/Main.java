public class Main {
    public static void main(String[] args) {

          Milk milk = new Milk();
          Box<Milk> milkbox = new Box<>();
          milkbox.put(milk);
          milkbox.get();

          Cake cake = new Cake();
          Box<Cake> cakebox = new Box<>();
          cakebox.put(cake);
          cakebox.get();


    }
}