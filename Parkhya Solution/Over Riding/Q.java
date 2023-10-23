class P
{
public static void main(String aa[])
{
System.out.println("P-main");
}
static
{
System.out.println("P-sib");
}
}

class Q extends P
{
public static void main(String aa[])
{
System.out.println("Q-main");
}
static
{
System.out.println("Q-sib");
}
}