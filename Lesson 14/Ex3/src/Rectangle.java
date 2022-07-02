public class Rectangle extends Shape{

    double length;
    double height;

    public Rectangle(double length, double height){
        this.length = length;
        this.height = height;

    }
    double getPerimeter(){
        return 2*length + 2*height;
    }


    double getArea(){
        return length * height;
    }
}
