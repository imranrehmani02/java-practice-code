//Reverse a String

class ReverseString
{
public static void main(String args[])
{
String name="Ratlam";
int leng=name.length();
String rev="";
for(int i=leng-1; i>=0; i--)
{
rev=rev+name.charAt(i);
}
System.out.println("Reverse a "+name+" is "+rev);
}
}