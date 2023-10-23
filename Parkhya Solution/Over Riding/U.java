class R
{
public static void main(String args[])
{
System.out.println("R-main");
}
static
{
System.out.println("R-sib");
}
}

class S extends R
{
public static void main(String args[])
{
System.out.println("S-main");
}
static
{
System.out.println("S-sib");
}
}

class T extends S
{
static
{
System.out.println("T-sib");
}
}

class U
{
public static void main(String args[])
{
System.out.println("U main-b");
T.main(args);
System.out.println("U main-e");
}
static
{
System.out.println("U-sib");
}
}