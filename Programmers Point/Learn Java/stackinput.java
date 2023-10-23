import java.util.*;
import java.util.Scanner;
class Demo
{
public static void main(String aa[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size of stack");
int size=sc.nextInt();
System.out.println("enter "+size+" elements");
Stack<String> st=new Stack<String>();
for(int i=1; i<=size; i++)
{
st.push(sc.next());
}
if(st.isEmpty())
{
System.out.println("stack is empty");
}
else
{
for(String s:st)
{
System.out.println(s);
}
}
}
}