/* Final with refrence variable:- If we declare any refrence variable with final. We cant change the value of that final refrence variable. */

class Final5
{
public static void main(String args[])
{
final Final5 f=new Final5();
System.out.println("old  "+f);

//f=new Final5();
System.out.println("new "+f);
}
} 