package OOP_Mid_Semester;
public class W {
public static void main(){
F d=new D();
System.out.println("F d=new D();"+d.a);//a=10
d.v();//F's v()
d.a();//overriding occurs

D s=new D();
System.out.println("D s=new D();"+s.a);//a=5
s.v();//
s.a();//
}
}
