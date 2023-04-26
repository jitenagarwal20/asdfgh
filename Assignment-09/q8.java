interface calc{
   void earnings();
   void deductions();
   void bonus();
}
class manager implements calc{
    int sal;
    manager(int x){
        sal=x;
    }
    public void earnings(){
        float ear;
        ear=sal;
        ear+=0.15f*sal;
        ear+=0.8f*sal;
        System.out.println("Earnings "+ear);
    }
    public void deductions(){
        float pf;
        pf=sal;
        pf-=0.12*sal;
        System.out.println("PF "+pf);
    }
    public void bonus(){};
}
class substaff extends manager{
    substaff(int x){
        super(x);
    }
    public void bonus(){
        float b;
        b=0.5f*sal;
        System.out.println("Bonus "+b);
    }
}
public class q8{
  public static void main(String[] args){
    substaff sub=new substaff(25000);
    sub.earnings();
    sub.deductions();
    sub.bonus();
  }
}