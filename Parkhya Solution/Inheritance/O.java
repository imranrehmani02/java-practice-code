class L
{
L()
{
System.out.println("L()");
}
}

class M extends L
{
M()
{
System.out.println("M()");
}
}

class N extends M
{
N()
{
System.out.println("N()");
}
}

class O
{
public static void main(String aa[])
{
L l1=new L();
System.out.println("****************");

M m1=new M();
System.out.println("****************");

N n1=new N();
System.out.println("****************");
}
}