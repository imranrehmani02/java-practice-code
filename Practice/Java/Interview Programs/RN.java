class RN
{
public static void main(String aegs[])
{
int n=123, r=0;
while(n!=0)
{
int digit=n%10;
r=r*10+digit;
n/=10;
}
System.out.println("Reversed no "+r);
}
}
