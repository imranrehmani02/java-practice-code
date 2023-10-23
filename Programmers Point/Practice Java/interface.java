interface Dummy
{
void show();
}

interface Demo
{
void display();
}

class Main implements Demo,Dummy
{
public void show()
{
System.out.println("show is running");
}

public void display()
{
System.out.println("display is running");
}

public static void main(String aa[])
{
Main m=new Main();
m.show();
m.display();
}
}