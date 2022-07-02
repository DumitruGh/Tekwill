public class Triangle extends Shape {
    double l1;
    double l2;
    double l3;


    public Triangle(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    double getPerimeter() {
        return l1 + l2 + l3;
    }

    double getArea() {
        double semip = (l1+l2+l3)/2;
        return Math.sqrt(semip * (semip - l1) * (semip- l2) * (semip- l3));
    }
}
