package Test;
import java.util.*;
public class Address {
  String line1;
  String line2;
  String line3;
  char[] city;
  char[] state;
  String pin;
  String[] m=new String[6];
  Address(String s){
    m=s.split("\\$");
    line1=m[0];
    line2=m[1];
    line3=m[2];
    city=m[3].toCharArray();
    state=m[4].toCharArray();
    pin=m[5];
    }
    public String getline1(){
        return this.line1;
    }
    public String getline2(){
        return this.line2;
    }
    public String getline3(){
        return this.line3;
    }
    public String getCity(){
        return new String(this.city);
    }
    public String getState(){
        return new String(this.city);
    }
    public String getPin(){
        return this.pin;
    }
    public String toString(){
     return "Address: "+this.line1+"\n"+this.line2+"\n"+this.line3+"\n"+new String(this.city)+"\n"+new String(this.state)+"\n"+this.pin+"\n";
    }
}
