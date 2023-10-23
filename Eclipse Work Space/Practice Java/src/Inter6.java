interface Printable1
{
void print();
static void run()
{
System.out.println("Yes I am static new one");	
}
default void run1()
{
	System.out.println("Yes I am default void run 1");	
}
}

interface Showable1
{
void print();	
}

public class Inter6 implements Showable1,Printable1
{
public void print()
{
	System.out.println("Hello print");		
}

	public static void main(String[] args) {
	Inter6 i=new Inter6();
	i.print();
	i.run1();
	Printable1.run();

	}

}
