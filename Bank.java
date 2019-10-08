package Test;
import java.util.*;
public class Bank {
int maxActive=30;
private ArrayList<Account> accts;
Bank(){
accts=new ArrayList<Account>();
}

public boolean addAccount (Account newone) {
if(accts.size()< maxActive)
{
    accts.add(newone);
    return true;
}
return false;
}
public boolean removeAccount (long acctnum) {
if(accts!=null && accts.size()>0)
{
Iterator<Account> itr= accts.iterator();
while(itr.hasNext())
{
if(itr.next().getAcctNumber()==acctnum)
{
    itr.remove();
    return true;
}
}
}
return false;
}
public double deposit(long acctnum, double amount) {
Iterator<Account> itr= accts.iterator();
while(itr.hasNext())
{
Account a=itr.next();
if(a.getAcctNumber()==acctnum)
a.setBalance(amount);
return a.getBalance();
}
return -1;
}
public double withdraw(long acctnum, double amount) {
Iterator<Account> itr= accts.iterator();
while(itr.hasNext())
{
Account a=itr.next();
if(a.getAcctNumber()==acctnum)
{
if(a.getBalance()<amount)
break;
else{
a.setBalance(-amount);
return a.getBalance();
}
}
}
return -1;
}

@Override
public String toString() {
return "@"+accts;
}
}
