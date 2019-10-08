package Test;
import java.util.*;
public class Stack {
    LinkedList l;
    Stack(){
    l=new LinkedList();
    }
public void push(int o){
l.addLast(o);
}
public void pop(){
    if(l.size()==0){
    System.out.println("Can't pop out! Lack of elements");
    }
l.remove(l.size()-1);
}
public String toString(){
return "Stack Status # "+l+"\n";
}
}
