interface Demo
{
void show();
}

class Aa implements Demo
{
public void show()
{
System.out.println("from Aa");
}
}

class Bb implements Demo
{
public void show()
{
System.out.println("from Bb");
}
}

class Cc implements Demo
{
public void show()
{
System.out.println("from Cc");
}
}

class Dummy
{
static Demo display(String n)
{
if (n.equals("Aa"))
{
return new Aa();
}
else if(n.equals("Bb"))
{
return new Bb();
}
else
{
return new Cc();
}
}
}

class Main
{
public static void main(String aa[])
{
Demo d=Dummy.display("Cc");
d.show();
Connection con=DriverManager.getConnection("url");
}
}