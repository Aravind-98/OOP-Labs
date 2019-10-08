package Test;
import java.util.*;
public class StudentList {
public static Student[] slist=new Student[3];
public static int count=0;
public static void addStudent(Student s)
{
    if(count==20||count>20){
        return;
    }
    slist[count++]=s;
}
public static Student[] getStudentWithAge(int a){
ArrayList<Student> l=new ArrayList<Student>();
for(int i=0;i<slist.length;i++)
{
    if(slist[i].getAge()==a)
    l.add(slist[i]);
}
Student[] arr=(Student[])l.toArray(new Student[l.size()]);
return arr;
}
public static Student[] getStudentWithLastName(String lastname){
ArrayList<Student> l=new ArrayList<Student>();
for(int i=0;i<slist.length;i++)
{
    if(slist[i].getN().getLname().equals(lastname))
    l.add(slist[i]);
}
Student[] arr=(Student[])l.toArray(new Student[l.size()]);
return arr;
}
public static Student[] getStudentWithinRange(int minage,int maxage){
ArrayList<Student> l=new ArrayList<Student>();
for(int i=0;i<slist.length;i++)
{
    int a=slist[i].getAge();
    if((a>minage || a==minage) && (a<maxage || a==maxage))
    l.add(slist[i]);
}
Student[] arr=(Student[])l.toArray(new Student[l.size()]);
return arr;
}
}
