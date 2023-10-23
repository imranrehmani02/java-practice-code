class NumberPattern7
{
public static void main(String args[])
{
for(int i=1; i<=5; i++)
{
int n=i;
for(int j=1; j<=i; j++)
{
System.out.print(n+" ");
n=n+5-j;
}
System.out.println();
}
}
}

/* output

1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
*/