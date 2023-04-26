interface Inter_1{
    void display();
}
class Student implements Inter_1{
    public void display(){
        System.out.println("In overriden Interface Method");
    }
    void nonIfaceMethod(){
        System.out.println("In class Method");
        System.err.println("Does not belongs to Interface Method");
    }
}
public class q5 {
    public static void main(String[] args){
        Student obj=new Student();
        obj.display();
        obj.nonIfaceMethod();
        Inter_1 obj1 =new Student();
        obj1.display();
    }
}
