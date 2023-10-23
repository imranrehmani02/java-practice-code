class ArmStrong
{
public static void main(String aa[])
{
double num=153,orignalnum,rem,result=0;
orignalnum=num;
while(orignalnum!=0)
{
rem=orignalnum%10;
result=Math.pow(rem,3);
orignalnum/=10;
}
if(result==num)

System.out.println(num+" is an armstrong num");

else

System.out.println(num+" is not an armstrong num");

}
}