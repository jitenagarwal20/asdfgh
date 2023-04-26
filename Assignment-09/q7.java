abstract class shape{
    abstract void area();
}
interface Inter_1{
    void display();
}
class Square extends shape implements Inter_1{
    double s;
    Square(double x){
        s=x;
    }
    void area(){
        double a=s*s;
        System.out.println("Area of the Square is "+a);
    }
    public void display(){
        System.out.println("Length of the side of the Square is "+s);
    }
}
public class q7{
    public static void main(String[] args){
        Square obj=new Square(3.7);
        obj.area();
        obj.display();
    }
}
