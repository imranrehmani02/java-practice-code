class S
{
S()
{
System.out.println("S()");
}
}

class R extends S
{
R()
{
super();
System.out.println("R()");
}
}

class T extends R
{
T()
{
System.out.println("T()");
}
}

class U
{
public static void main(String aa[])
{
T t=new T();
System.out.println("----------");
R r=new R();
System.out.println("----------");
S s=new S();
System.out.println("----------");
}
}