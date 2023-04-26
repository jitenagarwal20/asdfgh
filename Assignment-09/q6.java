interface A{
    void math1();
    void math2();
}
interface B extends A{
    void meth3();
}
class Student implements B{
    public void math1(){
        int a=5,b=10;
        int c=a+b;
        System.out.println(a+" + "+b+" = "+c);
    }
    public void math2(){
        int a=15,b=10;
        int c=a-b;
        System.out.println(a+" - "+b+" = "+c);
    }
    public void meth3(){
        int a=5,b=10;
        int c=a*b;
        System.out.println(a+" * "+b+" = "+c);
    }
}
public class q6 {
    public static void main(String[] args){
        Student obj=new Student();
        obj.math1();
        obj.math2();
        obj.meth3();
    }
}
