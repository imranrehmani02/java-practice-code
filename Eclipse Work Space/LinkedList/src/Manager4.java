import java.util.LinkedList;
public class Manager4 {
public static void main(String args[])
{
	LinkedList list=new LinkedList();
	list.add(200);
	list.add(true);
	list.add(22.3);
	list.add("Abcdef");
	System.out.println(list);
	System.out.println("--------------");
	for(int i=0; i<list.size(); i++)
	{
		System.out.print(list.get(i)+",");
	}
	System.out.println();
	System.out.println("---------------");
	for(Object obj:list)
	{
		System.out.print(obj+",");
	}
}
}
