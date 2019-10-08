package Test;

public class Item {

private String itemName;
private String itemidNo;
private int itemQuantity;
private double itemPrice;

public Item(String name,String id,int q,double p){
itemName=name;
itemidNo=id;
itemQuantity=q;
itemPrice=p;
}
public Item(String name,String id,int q){
itemName=name;
itemidNo=id;
itemQuantity=q;
itemPrice=500;
}
public Item(String name,String id){
itemName=name;
itemidNo=id;
itemQuantity=1;
itemPrice=500;
}	
public String getItemName(){
return(this.itemName);
}
public String getItemId(){
return(this.itemidNo);
}
public int getItemQuantity(){
return(this.itemQuantity);
}
public double getItemPrice(){
return(this.itemPrice);
}
public void setItemName(String S){
this.itemName=S;
return;
}
public void setItemId(String S){
this.itemidNo=S;
return;
}
public void setItemQuantity(int g){
this.itemQuantity=g;
return;
}
public void setItemPrice(double d){
this.itemPrice=d;
return;
}
}
