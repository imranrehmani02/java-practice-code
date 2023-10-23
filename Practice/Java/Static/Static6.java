class S6
{
static
{
System.out.println("static block 1 is running from S6");
}
}

class Static6 extends S6
{
static
{
System.out.println("static block 2 is running from Static6");
}

public static void main(String args[])
{
System.out.println("main method is running");
}
}