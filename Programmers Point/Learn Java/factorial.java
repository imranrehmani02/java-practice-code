import java.util.Scanner;
class Facto
{
public static void main(String aa[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a no.");
int n=sc.nextInt();
int i=1,fact=1;
for(i=1; i<=n; i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}