class V
{
V(int i)
{
System.out.println("V(int)");
System.out.println("V(int)"+i);
}
}

class W extends V
{
W(int i)
{
super(10);
System.out.println("W(int)");
System.out.println("W(int)"+i);
}
public static void main(String args[])
{
V v1=new V(25);
System.out.println("---------");
W w1=new W(35);
System.out.println("----------");
}
}