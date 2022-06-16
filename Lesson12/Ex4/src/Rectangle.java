public class Rectangle extends Shape{
    double w;
    double he;

    public Rectangle(double w, double he){
        this.w = w;
        this.he = he;
    }
    public double area() {
       return w * he;

    }
}
