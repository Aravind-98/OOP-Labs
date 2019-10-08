package Test;
import java.util.*;
public class AddressList{
public static int countAddressWithCity(Address[] addressList, String city){
if(addressList==null || addressList.length==0 || city==null)
return -1;
int count=0;
for(Address a:addressList)
{
    if(a.getCity().equals(city))
    {
        count++;
    }
}
return count;
}
public static int countAddressWithPin(Address[] addressList, String strP){
if(addressList==null || addressList.length==0 || strP==null)
return -1;
int count=0;
for(Address a:addressList)
{
    if(a.getPin().equals(strP))
    {
        count++;
    }
}
return count;
}
public static Address[] getAddressWithCity(Address[] addressList, String city){
if(addressList==null || addressList.length==0 || city==null)
return null;
int count=0;
ArrayList<Address> d=new ArrayList<Address>();
for(Address a:addressList)
{
    if(a.getCity().equals(city)){
    d.add(a);
    }
}
if(d!=null && d.size()!=0)
return (Address[])d.toArray(new Address[d.size()]);
return null;
}
public static Address[] getAddressWithPin(Address[] addressList, String strP){
if(addressList==null || addressList.length==0 || strP==null)
return null;
int count=0;
ArrayList<Address> d=new ArrayList<Address>();
for(Address a:addressList)
{
    if(a.getPin().equals(strP)){
    d.add(a);
    }
}
if(d!=null && d.size()!=0)
return (Address[])d.toArray(new Address[d.size()]);
return null;
}
}
