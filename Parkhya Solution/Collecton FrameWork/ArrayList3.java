import java.util.*;
public class ArrayList3
{
public static void main(String args[])
{
ArrayList a3=new ArrayList();
a3.add(101);
a3.add(true);

int i=(Integer)a3.get(0);
boolean j=(Boolean)a3.get(1);

System.out.println(i);
System.out.println(j);
}
}