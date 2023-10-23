class Demo
{
String n;
Demo (String n)
{
this.n=n;
}
public String toString()
{
return n;
}
public static void main(String aa[])
{
String s=new String("Hello");
System.out.println(s);

Demo d=new Demo("Hello");
System.out.println(d);
}
}