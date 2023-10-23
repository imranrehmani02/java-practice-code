class Demo
{
Demo()
{
System.out.println("~  ~  ~");
System.out.println("~  ~  ~");
System.out.println("~  ~  ~");
System.out.println("~  ~  ~");
System.out.println("~  ~  ~");
}
Demo(double a)
{
this();
for(int i=10;i>=1;i--)
{
for(int j=1; j<=i; j++)
{
System.out.print('*'+" ");
}
System.out.println();
}
}
Demo(char a)
{
this(6.2);
for(int i=1;i<=10;i++)
{
for(int j=1; j<=i; j++)
{
System.out.print(a+" ");
}
System.out.println();
}

}
public static void main(String args[])
{
Demo d=new Demo('@');
}
}