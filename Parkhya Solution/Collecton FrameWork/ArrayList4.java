import java.util.*;
public class ArrayList4
{
public static void main(String args[])
{
ArrayList a1=new ArrayList();
a1.add(101);
a1.add("Bharat");
a1.add(56.3);
System.out.println(a1);

System.out.println(a1.size());

for(int i=0; i<(a1.size()); i++)
{
System.out.println(a1.get(i));
}
}
}