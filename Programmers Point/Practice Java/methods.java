class Demo
{
void main()
{
System.out.println("main is running");
}
void main(int a)
{
System.out.println("cube is :-"+a*a*a);
}
void main(int a,int b)
{
System.out.println("mul is :- "+a*b);
}
public static void main(String aa[])
{
Demo d=new Demo();
d.main();
d.main(5);
d.main(5,4);
}
}