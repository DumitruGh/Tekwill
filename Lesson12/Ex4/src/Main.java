import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape();
        Square square = new Square(3);
        Circle circle = new Circle(2.5);
        Triangle triangle = new Triangle(2.5, 3.2);
        Rectangle rectangle = new Rectangle(2.5, 3.1);

         printAreaOfShape(shape);
         printAreaOfShape(circle);
         printAreaOfShape(square);
         printAreaOfShape(triangle);
         printAreaOfShape(rectangle);
    }

    public static void printAreaOfShape(Shape shape){
        System.out.println(shape.area());
    }
}