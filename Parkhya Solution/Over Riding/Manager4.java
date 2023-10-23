class L
{
static int i;
static 
{
System.out.println("from L-sib");
}
}

class M extends L
{
static 
{
System.out.println("from M-sib");
}
}

class Manager4
{
public static void main(String aa[])
{
System.out.println("----------");
System.out.println(M.i);
System.out.println("----------");
}
}