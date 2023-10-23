final class F4
{
void show()
{
System.out.println("show is running from show");
}
}

class Final4 extends F4
{
public static void main(String srgs[])
{
Final4 f=new Final4();
f.show();                             //error
}
}