import java.util.LinkedList;
public class Manager2 {
public static void main(String args[])
{
LinkedList list=new LinkedList();
list.add(90);
list.add(true);
list.add("Abc");
list.add("Pqr");
list.add("Xyz");

int i=(Integer)list.get(0);     //type casting
boolean j=(Boolean)list.get(1);

System.out.println(i);
System.out.println(j);
System.out.println(list);
}
}
