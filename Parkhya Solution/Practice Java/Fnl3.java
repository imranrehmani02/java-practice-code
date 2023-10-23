class F
{
final void show()
{
System.out.println("show is running from F");
}
}

class Fnl3 extends F
{
void show()
{
System.out.println("show is running from Fnl3");
}
public static void main(String args[])
{
Fnl3 f1=new Fnl3();
f1.show();
}
}

// final method cant over ride