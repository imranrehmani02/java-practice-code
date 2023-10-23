class ReverseNo
{
public static void main(String aa[])
{
int num=3654, reversed=0;
while(num!=0)
{
int digit=num%10;
reversed=reversed*10+digit;
num/=10;
}
System.out.println("Reversed no.- "+reversed);
}
}