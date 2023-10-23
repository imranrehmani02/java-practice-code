import java.util.Scanner;
class Demo
{
public static void main(String aa[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size of array");
int s=sc.nextInt();
int ary[]=new int[s];

System.out.println("enter position");
int p=sc.nextInt();
System.out.println("enter elements for this position");
int e=sc.nextInt();

try
{
ary[p]=e;
System.out.println("element is "+ary[p]);
}
catch(ArrayIndexOutOfBoundsException ex)
{
System.out.println("index not found");
}
}

}