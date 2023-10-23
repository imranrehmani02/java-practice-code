//Command Line Argument

class Demo
{
public static void main(String aa[])
{
String a=aa[0];
String b=aa[1];
String c=aa[2];

System.out.println(a+b+c);

int i=Integer.parseInt(a);
int j=Integer.parseInt(b);
double k=Double.parseDouble(c);

System.out.println(i+j+k);
}
}