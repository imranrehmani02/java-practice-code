
public class N {

	public static void main(String[] args) {
System.out.println("from N class");

	}
	static
	{
		System.out.println("Static  N");
	}

}

class O extends N
{
	static
	{
		System.out.println("Static  O");
	}
}
