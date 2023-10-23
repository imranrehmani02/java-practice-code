interface Dm1
{
void show();
}

class Dm2 implements Dm1
{
public void show()
{
System.out.println("show is running");
}
public static void main(String args[])
{
Dm1 d1=new Dm2();
d1.show();
}
}