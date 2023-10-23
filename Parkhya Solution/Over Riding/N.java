class N
{
public static void main(String aa[])
{
System.out.println("from N");
}
static
{
System.out.println("sib-N");
}
}

class O extends N
{
static
{
System.out.println("sib-O");
}
}