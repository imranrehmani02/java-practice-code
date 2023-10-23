class S4
{
static void show()
{
System.out.println("show is running from S4");
}
}

class Static4
{
static void show()
{
System.out.println("show is running from Static4");
}
public static void main(String args[])
{
show();
S4.show();       //aggregation calling
}
}