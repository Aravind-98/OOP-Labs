package Test;
public class Account {
    private long acctNumber; 
    private double balance;
    private String name;
    Account(long a,double d,String s){
        this.acctNumber=a;
        this.balance=d;
        this.name=s;
    }
    public long getAcctNumber(){
    return this.acctNumber;
    }
    public double getBalance(){
    return this.balance;
    }
    public String getName(){
    return this.name;
    }
    public void setBalance(double amount){
    this.balance+=amount;
    return;
    }
    public String toString(){
    return "# A/C No: "+this.acctNumber+" Balance : "+this.balance+"$ NAME: "+this.name+"\n";
    }
}

