interface Dm1
{
void show();
}

interface Dm2 extends Dm1
{
void display();
}

class Dm3 implements Dm2
{
public void show()
{
System.out.println("show is running");
}

public void display()
{
System.out.println("display is running");
}

public static void main(String args[])
{
Dm3 d3=new Dm3();
d3.show();
d3.display();
}
}