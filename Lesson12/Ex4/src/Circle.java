public class Circle extends Shape {
 double R;

 public Circle(double R){
     this.R = R;
 }
    public double area() {
        return Math.PI*R*R;

    }
}
