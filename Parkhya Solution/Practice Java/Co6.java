class Co6
{
static 
{
System.out.println("static 1 ");
}
static 
{
System.out.println("static 2");
}
static
{
System.out.println("static 3");
}
{
System.out.println("Instance block 1");
}
{
System.out.println("Instance block 2");
}
{
System.out.println("instance block 3");
}
Co6()
{
System.out.println("Default constructor");
}
Co6(int i)
{
this();
System.out.println("int i "+i);
}
Co6(double i)
{
this(73);
System.out.println("double is "+i);
}
public static void main(String args[])
{
Co6 c16=new Co6();
System.out.println("***************");
System.out.println();
Co6 c26=new Co6(25);
System.out.println("+++++++++++");
System.out.println();
Co6 c36=new Co6(11.4);
System.out.println("---------------");
}
}