//Arm Strong

import java.util.Scanner;
class L18Armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number that you want to check");
int n=sc.nextInt();
int t1=n;
int leng=0;
while(t1!=0)
{
leng=leng+1;
t1=t1/10;
}

int t2=n;
int arm=0;
int rem;
while(t2!=0)
{
int mul=1;
rem=t2%10;
for(int i=1; i<=leng; i++)
 {
mul=mul*rem;
}
arm=arm+mul;
t2=t2/10;
}
if(arm==n)
{
System.out.println(n+" is armstrong");
}
else
{
System.out.println(n+" is not armstrong");
}
}
}