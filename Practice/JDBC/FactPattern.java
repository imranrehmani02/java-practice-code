/*Factory Pattern*/

interface Demo
{
void show();
}

class A implements Demo
{
public void show()
{
System.out.println("A");
}
}

class B implements Demo
{
public void show()
{
System.out.println("B");
}
}

class C implements Demo
{
public void show()
{
System.out.println("C");
}
}

class Dummy
{
static void display(String n)
{
if(n.equals("A"))
{
return new A();
}
else if(n.equals("B"))
{
return new B();
}
else if(n.equals("C"))
{
return new C();
}
}
}

class Main
{
public static void main(String args[])
{
Demo d=Dummy.display(C);
d.show();
Connection con=DriverManager.getConnection("url");
}
}