public class Circle extends Shape{

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

     double getPerimeter(){
        return 2*Math.PI*radius;
     }
     double getArea(){
         return radius*radius*Math.PI;
     }
}
