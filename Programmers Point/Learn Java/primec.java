class Prime
{
public static void main(String aa[])
{
int low=2, high=10,i,flag;
while(low<high)
{
flag=0;
for(i=2; i<=low/2; i++)
{
if(low%i==0)
{
flag=1;
break;
}
}
if(flag==0)
System.out.println(low);
++low;
}
}
}