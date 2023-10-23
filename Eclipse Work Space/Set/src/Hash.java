import java.util.HashSet;
import java.util.Iterator;
public class Hash {
public static void main(String args[])
{
HashSet set=new HashSet();
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
