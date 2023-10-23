class I
{
I()
{
System.out.println("I()");
}
}

class J extends I
{
J()
{
System.out.println("J()");
}
}

class K extends J
{
K()
{
System.out.println("K()");
}
}

class In3
{
public static void main(String args[])
{
I i1=new I();
System.out.println("-------------");
J j1=new J();
System.out.println("-------------");
K k1=new K();
System.out.println("--------------");
}
}