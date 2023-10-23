class I extends Thread
{
public void run()
{
int i=10/0;
System.out.println("end of child");
}
}
public class MT5 {

	public static void main(String[] args) {
		I i1=new I();
		i1.start();
		for(int i=10; i<20; i++)
		{
			System.out.println(i);
		}
	}

}
