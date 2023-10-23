class Co7
{
static
{
System.out.println("static 1");
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
System.out.println("instance block 1");
}
{
System.out.println("instance block 2");
}
{
System.out.println("instance block 3");
}


Co7()
{
System.out.println("default constructor Co7");
}
Co7(int i)
{
this();
System.out.println("i = "+i);
}
Co7(double i)
{
this(15);
System.out.println("i = "+i);
}
static void show()
{
System.out.println("static show is running.");
}
static void disp()
{
System.out.println("static disp is running.");
}
public static void main(String args[])
{
Co7 c71=new Co7();
Co7.show();
Co7.disp();
System.out.println("--------");
Co7 c72=new Co7(16);
System.out.println("---------");
Co7 c73=new Co7(22.3);
}
}