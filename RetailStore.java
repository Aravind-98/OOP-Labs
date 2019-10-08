package Test;
public class RetailStore {
int[] id={1,2,3,4};
double[] price={1.00,2.0,5.65,4.34};
public double computePrice(int value){
for(int i=0;i<price.length;i++){
if(id[i]==value)
{
    return price[i];
}
}
return price[value];
}
public static void main(){
RetailStore re=new RetailStore();
System.out.println("price of item 2:"+re.computePrice(2));
System.out.println("price of item 1:"+re.computePrice(2));
System.out.println("price of item 5:"+re.computePrice(5));
}
}
