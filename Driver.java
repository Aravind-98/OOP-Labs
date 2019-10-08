package Test;
public class Driver {
public static void main() {
Bank b=new Bank();
b.addAccount(new Account(1,1000.0,"Aravindan"));
b.addAccount(new Account(2,2000.0,"Rampwalk"));
b.addAccount(new Account(3,4000.0,"ritik"));
b.addAccount(new Account(4,4000.0,"dhruv"));
System.out.println("Initial Account Status: \n"+b);
b.deposit(1,500.0);
b.withdraw(2,1000.0);
b.withdraw(4,3000.0);
b.removeAccount(2);
System.out.println("Final Account Status: \n"+b);
}
}