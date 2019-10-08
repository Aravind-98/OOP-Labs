package Test;

public class ReservationInCharge {
public static void main(){
ReservationCounter c = ReservationCounter.initReservationCounter();
c.standInLine("A");
c.standInLine("B");
c.standInLine("C");
System.out.println(c);
c.leaveTheLine();
System.out.println(c);
System.out.println(c.checkCustomerAt(1));
}
}
