abstract class Dummy
{ 
Abstarct void show();
void display()
{
System.out.println("disp is running");
}
}

class Demo extends Dummy
{
void show()
{
System.out.println("show is running");
}
public static void main(String aa[])
{ 
Dummy d=new Demo();
d.show();
}
}