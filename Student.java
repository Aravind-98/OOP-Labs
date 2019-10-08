package Test;
public class Student {
/*
   Student class has two attributes: name of type Name [note that Name is class
as mentioned above] and age of type int. The class supplies only one parameterized constructor
which receives the values forall instance fields of the class as parameters. First parameter is of
Name type and second is of type int. The class supplies accessor method for every instance field
and toString() method which returns a string after concatenating and adding spaces between
values of first name , middle name , last name and age attributes for this instance. Provide the
implementation for the class “Student” as mentioned below as per the specification given
above.
   */
  private Name n;
  private int age;
  Student(Name n,int age){
    this.n=n;
    this.age=age;
    }
    public int getAge(){
    return this.age;
    }
    public Name getN(){
    return this.n;
    }
    public String toString(){
        return "Name: "+this.n.getName()+" "+" Age: "+ this.age;
    }
}
