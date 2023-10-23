class NumberPattern8
{
public static void main(String args[])
{
int n=0;
for(int i=1; i<=5; i++)
{
if(i%2!=0)
{
for(int j=1; j<=3; j++)
{
n++;
System.out.print(n+" ");
}
}
else
{
int t=n+1;
for(int j=n+3; j>=t; j--)
{
n++;
System.out.print(j+" ");
}
}
System.out.println();
}
}
}

/* output
1 2 3
6 5 4
7 8 9
12 11 10
 13 14 15
*/