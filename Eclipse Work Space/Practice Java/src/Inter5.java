interface Printable
{
void print();	
}

interface Showable
{
void show();	
}
public class Inter5 implements Printable,Showable
{
public void print()
{
System.out.println("print from printable");	
}

public void show()
{
	System.out.println("show from showable");	
}
public static void main(String args[])
{
Inter5 i=new Inter5();
i.print();
i.show();
}
}
