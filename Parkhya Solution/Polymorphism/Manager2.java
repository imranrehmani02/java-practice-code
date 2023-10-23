class E
{
void test()
{
System.out.println("from E test");
}
}

class F extends E
{
void test()
{
System.out.println("from F test");
}
}

class G extends F
{
void test()
{
System.out.println("from G test");
}
}

class Manager2
{
public static void main(String args[])
{
E e1=new E();
F f1=new F();
G g1=new G();
E e2=new F();

E[]x=new E[5];

x[0]=e1;
x[1]=e2;
x[2]=f1;
x[3]=g1;

x[0].test();
x[1].test();
x[2].test();
x[3].test();
}
}