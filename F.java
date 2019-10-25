package OOP_Mid_Semester;
public class F {
    public int a=10;
    static int b=7;
    static{
    System.out.println("Inside static block of parent");
    }
    static{
    System.out.println("Inside static block 2 of parent");
    }
    public F(){
    System.out.println("Inside constructor of F");
    }
    protected static void v(){
    System.out.println("Inside class F protected v()");
    }
    protected void a(){
    System.out.println("Inside class F private a()");
    }
}
