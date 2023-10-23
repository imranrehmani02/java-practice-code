import java.util.Scanner;
class Demo
{
public static void main(String aa[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter rows &coloums");
int s=sc.nextInt();
int ary[][]=new int [s][s];
System.out.println("enter "+s*s+"  elements");

for(int i=0; i<s;i++)
{
for(int j=0;j<s;j++)
{
ary[i][j]=sc.nextInt();
}
}
System.out.println("your matrix is -");
for(int i=0; i<s;i++)
{
for(int j=0;j<s;j++)
{
System.out.print(ary[i][j]+" ");
}
System.out.println();
}
}
}