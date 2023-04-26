interface motor{
    int capacity=10;
    void run();
    void consume();
}
class washing_machine implements motor{
    public void run(){
       System.out.println("Class run function");
    }
    public void consume(){
      System.out.println("Class consume method");
    }
}
public class q9{
    public static void main(String[] args){
      washing_machine wm=new washing_machine();
      wm.run();
      wm.consume();
      System.out.println("Capacity of the Washing Machine is "+wm.capacity);
    }
}