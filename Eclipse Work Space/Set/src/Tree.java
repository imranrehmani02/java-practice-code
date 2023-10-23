import java.util.TreeSet;
import java.util.Iterator;
public class Tree {
public static void main(String args[])
{
TreeSet set=new TreeSet();
set.add("first");
set.add("second");
set.add("third");
set.add("forth");
set.add("fifth");

set.add("first");
set.add("second");
set.add("third");
set.add("forth");
set.add("fifth");

Iterator<String> i=set.iterator();
while(i.hasNext())
{
System.out.println(i.next());	
}
}
}
