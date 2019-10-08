package Test;
import java.util.*;
public class testAdd {
public static void main(){
Address[] a=new Address[3];
Scanner in=new Scanner(System.in);
for(int i=0;i<a.length;i++)
{
    a[i]=new Address(in.next());
}
System.out.println("Count with Chennai: "+ AddressList.countAddressWithCity(a,"Chennai")+"\n\n");
System.out.println("Count with 600088: "+ AddressList.countAddressWithPin(a,"600088")+"\n\n");
System.out.println("addresses in Chennai \n"+Arrays.toString(AddressList.getAddressWithCity(a,"Chennai"))+"\n\n");
System.out.println("addresses in 600088 \n"+Arrays.toString(AddressList.getAddressWithPin(a,"600088"))+"\n\n");
}
//"44$shakthi nagar$adambakkam$Chennai$Tamilnadu$600088"

}
