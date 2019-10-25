package OOP_Mid_Semester;
public class D extends F{
int a=5;
static int b=3;
static{
    System.out.println("Inside static block of child");
    }
    public D(){
    System.out.println("Inside constructor of D");
    }
protected static void v(){
System.out.println("Inside class D v()");
}
public void a(){
System.out.println("Inside class D a()       this.a:"+this.a+"     super.a:"+super.a+"    this.b:"+this.b     +"       super.b:"+super.b);
super.a=90;
super.b=100;
System.out.println("Inside class D a()       this.a:"+this.a+"     super.a:"+super.a+"    this.b:"+this.b     +"        super.b:"+super.b);
this.a=-100;
super.b=-50;
}
}
