class E
{
int i;
static int j;
void test1()
{
System.out.println("test 1");
}
static void test2()
{
System.out.println("test 2");
}
}

class F extends E
{
int m;
static int n;
void test3()
{
System.out.println("test 3");
}
static void test4()
{
System.out.println("test 4");
}
}

class In2
{
public static void main(String args[])
{
F.test2();
F.test2();

E.j=10;
F.n=20;

E e1=new E();
e1.i=30;
e1.test1();

F f1=new F();
f1.i=40;
f1.m=50;

f1.test1();
f1.test3();

System.out.println("------------");
System.out.println(E.j);
System.out.println(F.n);
System.out.println(e1.i);
System.out.println(f1.i+" "+f1.m);
}
}