public class UpDw1
{
void show()
{
System.out.println("show is running from UpDw1");
}
public static void main(String args[])
{
Object o=new UpDw1();    //Upcasting
UpDw1 d=(UpDw1) o;        //Downcasting
d.show();
}
}