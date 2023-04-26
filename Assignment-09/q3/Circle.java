package Geometry;
import java.util.Scanner;
public class Circle {
    double radius;
    void setRadius(){
        Scanner o=new Scanner(System.in);
        radius=o.nextDouble();
    }
    double getRadius(){
        return radius;
    }
}
