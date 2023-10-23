interface Dm1
{
void show();
}

interface Dm2
{
void show();
}

class Dm4 implements Dm1,Dm2
{
public void show()
{
System.out.println("show is running");
}
public static void main(String args[])
{
Dm4 d4=new Dm4();
d4.show();
}
}

