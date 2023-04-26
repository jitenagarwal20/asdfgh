package Geometry;
public class Application extends Circle{
    void area(){
        double r=super.getRadius();
        double a=3.14*r*r;
        System.out.println("Area of the Circle is "+a);
    }
    void perimeter(){
        double r=super.getRadius();
        double p=2*3.14*r;
        System.out.println("Perimeter of the Circle is "+p);
    }
}
