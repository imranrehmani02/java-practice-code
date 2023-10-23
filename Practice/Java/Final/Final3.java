class F2
{
final void box()
{
System.out.println("box is running from F2");
}
}

class F3 extends F2
{
void show()
{
System.out.println("show is running from F3");
}

final void display()
{
System.out.println("display is running from F3");
}
}

class Final3 extends F3
{
void show()
{
System.out.println("show is running from Final3");
}
public static void main(String args[])
{
Final3 f=new Final3();
f.show();
f.display();
f.box();
}
}