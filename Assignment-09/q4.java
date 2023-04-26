interface inter{
    int x=10;
    void display();
}
class Student implements inter{
    public void display(){
        System.out.println("Value of the variable present in interface is "+x);
    }
}
public class q4 {
    public static void main(String[] args){
        Student obj=new Student();
        obj.display();
    }
}
