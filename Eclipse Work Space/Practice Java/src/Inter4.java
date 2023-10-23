interface Abc1
{
int test1();
void test2();
}

abstract class Def implements Abc1
{
public int test1()
{
	System.out.println("from test 1");	
return 100;	
}
}
public class Inter4 extends Def
{
public void test2()
{
System.out.println("from test 2");	
}
	public static void main(String[] args) 
	{
	Inter4 i=new Inter4();
	i.test1();
	i.test2();
	}

}
