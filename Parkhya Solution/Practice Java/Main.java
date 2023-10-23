class A
{
void show()
{
System.out.println("show from A");
}
}

class B extends A
{
void add()
{
System.out.println("Add from B");
}
}

class Main 
{
public static void main(String args[])
{
A a1=new A();
a1.show();
System.out.println("-----------------------");
B b1=new B();
b1.add();
System.out.println("------------------------");
}
}