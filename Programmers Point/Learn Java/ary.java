import java.util.Scanner;
class Demo
{
public static void main(String aa[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size of array");
int s=sc.nextInt();
int ary[]=new int[s];

System.out.println("enter "+s+" elements");

for(int i=0;i<s; i++)
{
ary[i]=sc.nextInt();
}
System.out.println("your array elements are");
for(int i:ary)
{
System.out.println(i);
}
}
}