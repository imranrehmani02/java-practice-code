class Dummy
{
	void show()
	{
	System.out.println("1 show from dummy");
}
}

class Systim
{
	final static Dummy out=new Dummy();
}
class Demo
{
public static void main(String aa[])
{
	Systim.out.show();
	
}
}
