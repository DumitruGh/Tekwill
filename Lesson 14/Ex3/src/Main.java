public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());

        Rectangle rect = new Rectangle(5,10);
        System.out.println(rect.getPerimeter());
        System.out.println(rect.getArea());

        Circle circle = new Circle(10);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
    }
}