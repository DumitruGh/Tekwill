public class Main {
    public static void main(String[] args) {

        IntBinaryOperation addition = new Addition(1,4);
        System.out.println(addition.perform());
        IntBinaryOperation multiplication = new Multiplication(2,5);
        System.out.println(multiplication.perform());


        print(addition);
        print(multiplication);
    }


    public static void print(IntBinaryOperation obj){
        System.out.println(obj.perform());
    }
}