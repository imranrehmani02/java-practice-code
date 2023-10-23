abstract class F
{
abstract void test1();
void test2()
{
System.out.println("test 2");
}
}

class G extends F
{
void test1()
{
System.out.println("test 1");
}

public static void main(String args[])
{
G g1=new G();
g1.test1();
g1.test2();
System.out.println("done");
}
}