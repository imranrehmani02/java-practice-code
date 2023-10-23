class Id1
{
public static void main(String args[])
{
int i=0;
int j=i++ + i++ + i-- + --i + --i - i-- + ++i + i++;
System.out.println("i= "+i);
System.out.println("j= "+j);
}
}