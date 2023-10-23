package Pack1;

class A
{
int i;	
}
public class M1
{
	public static void main(String args[])
	{
		A a1=new A();
		a1.i=10;
		
		A a2=new A();
		a2.i=20;
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
	}
	}