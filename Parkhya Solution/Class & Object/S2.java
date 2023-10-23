class C1
{
static void run()
{
System.out.println("Hello C1");
}
static void show(int i)
{
System.out.println("static is "+i);
}
}
class S2
{
static void dsp(double j)
{
System.out.println("float is "+j);
}
public static void main(String arg[])
{
C1.run();
C1.show(25);
dsp(36.5);
}
}