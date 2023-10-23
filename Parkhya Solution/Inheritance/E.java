class C
{
C (int i)
{
System.out.println("C(int)");
}
}

class E1 extends C
{
E1(int i)
{
super(83);
System.out.println("E1(int)");
}

E1()
{
super(10);
System.out.println("E()");
}

public static void main(String aa[])
{
C c=new C(10);
System.out.println("-------");
E1 e1=new E1();
System.out.println("-------");
E1 e2=new E1();
System.out.println("-------");
}
}


