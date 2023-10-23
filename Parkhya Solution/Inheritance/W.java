class V
{
V(int i)
{
//System.out.println("V(int)");
System.out.println("V(int)"+i);
}
}

class W extends V
{
W(int i)
{
super(10);
System.out.println("W(int)"+i);
}
public static void main(String aa[])
{
V v=new V(30);
System.out.println("-------");
W w=new W(80);
System.out.println("--------");
}
}