package Test;

public class TestShop {

Customer C=new Customer("Aravindan","0849",6000.00);
Item i1=new Item("Bat","#4567",20,90.21);
Item i2=new Item("Ball","#9128",10,23.4);
Customer R=new Customer("Ritik","0349",6000.00);
public void lord(){
    C.buyItem(i1,8);
    C.buyItem(i2,4);
    R.buyItem(i1,8);
    R.buyItem(i2,4);
}
}
