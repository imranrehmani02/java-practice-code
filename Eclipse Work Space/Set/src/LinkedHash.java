import java.util.LinkedHashSet;
import java.util.Iterator;
public class LinkedHash {
public static void main(String args[])
{
LinkedHashSet set=new LinkedHashSet();
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
