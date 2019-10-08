package Test;
import java.util.Scanner;

public class Customer{

private String name;
private String idno;
private double balance;
private Item item;

public Customer(String n,String id,double b){
name=n;
idno=id;
balance=b;
}
public Customer(String n,String id){
name=n;
idno=id;
balance=5000.0;
}
public double getBalance(){
return(this.balance);
}
public void setBalance(double d){
this.balance=d;
return;
}

public void print(Item i){
System.out.println("ITEM NAME:"+i.getItemName()+"\nITEM ID:"+i.getItemId()+"\nITEM QUANTITY :"+i.getItemQuantity()+"\nITEM PRICE :"+i.getItemPrice()+"\n\n");
}

public void buyItem(Item item,int d){
print(item);
System.out.println("Your current balance is :"+this.getBalance());

//Scanner in=new Scanner(System.in);
//System.out.println("Enter the quantity you want to purchase :");
int quantityToBeBought=d;//in.nextInt();

if((item.getItemQuantity())>=1){
    
if(this.getBalance()>(quantityToBeBought*item.getItemPrice()) && (quantityToBeBought < item.getItemQuantity())){
this.setBalance(this.getBalance()-(item.getItemQuantity()*item.getItemPrice()));
item.setItemQuantity(item.getItemQuantity()-quantityToBeBought);
System.out.println("You have successfully bought : "+quantityToBeBought+" "+item.getItemName()+"\'s");
System.out.println("Your balance after purchase is :"+this.getBalance()+"\n\n\n");
}
else{
System.out.println("Insufficient Balance!");
}
}
else{
System.out.println("Order is not valid");
}
return;
}	
}