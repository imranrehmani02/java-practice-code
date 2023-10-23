//*Static block call only onr time*//

class J
{
static void test()
{
System.out.println("from J");
}
static
{
System.out.println("sib-J");
}
}
class K extends J
{
static 
{
System.out.println("sib-K");
}
}
class Manager3
{
public static void main(String aa[])
{
K.test();
J.test();
}
}