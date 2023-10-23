// Factorial by Recursion

class FactorialbyRecursion
{
static int fact=1;
public static void main(String args[])
{
int n=5;
FactorialbyRecursion ob=new FactorialbyRecursion();
System.out.println("factorial of "+n+" is "+fact);
}

void calcFact(int n)
{
if(n>=1)
{
fact=fact*n;
calcFact(n-1);
}
}
}