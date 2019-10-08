package Test;
public class Name {
private String fname;
private String mname;
private String lname;
Name(String s)
{
if(s.contains(","))
{
    String[] a=s.split(",");
    fname=a[0];
    mname=a[1];
    lname=a[2];
}
else{
    String[] b=s.split(";");
    fname=b[2];
    mname=b[1];
    lname=b[0];
}
}
public String getFname(){
return fname;
}
public String getLname(){
return lname;
}
public String getMname(){
return mname;
}
public String getName(){
return fname+" "+mname+" "+lname;
}
public String toString(){
return this.getName();
}
}
