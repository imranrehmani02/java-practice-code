class OL2
{
int add(int a,int b)
{
return a+b;
}
int add(int a,int b,int c)
{
return a+b+c;
}
public static void main(String aa[])
{
OL2 ol=new OL2();
System.out.println(ol.add(10,25));
System.out.println(ol.add(10,25,12));
}
}