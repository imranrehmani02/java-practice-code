import java.util.LinkedList;
public class Manager3 {
public static void main(String args[])
{
LinkedList list=new LinkedList();
list.add(123);
list.add(156.3);
list.add(true);
list.add("Abc");
System.out.println(list.size());
for(int i=0; i<list.size(); i++)
{
	System.out.println(list.get(i));
}
}
}
