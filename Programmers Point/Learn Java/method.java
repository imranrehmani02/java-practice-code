class Demo
{
void show()
{
System.out.println("show is running");
}

int cube(int a)
{
return a*a*a;
}

int mul(int a, int b)
{
return a*b;
}
public static void main(String aa[])
{
Demo d=new Demo();
d.show();
int i=d.cube(5);
System.out.println("cube is "+i);
int p=i*25/100;
int q=i+i;

int z=(i*i*i)/100;
System.out.println(z);
System.out.println(q);
System.out.println("25% of i is"+p);
System.out.println(d.mul(25,5));
}
}	