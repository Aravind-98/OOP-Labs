package Test;
import java.util.*;
public class ReservationCounter {
LinkedList<String> l;
private ReservationCounter(){
l=new LinkedList();
}
public void standInLine(String s){
l.add(s);
}
public void leaveTheLine(){
l.remove();
}
public String giveTicket(){
return l.getFirst();
}
public String checkCustomerAt(int pos){
return l.get(pos);
}
public static ReservationCounter initReservationCounter(){
return new ReservationCounter();
}
public int customersInLine(){
return l.size();
}
public String toString(){
return "#: "+l+" \n"+this.customersInLine();
}
}
