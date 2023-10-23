class S7
{
void show()
{
System.out.println("static refrence varible");
}
}

class Systim
{
final static S7 out=new S7();
}

class Static7
{
public static void main(String args[])
{
Systim.out.show();
}
}