class Rbi
{
int roi()
{
return 7;
}
}
class Sbi extends Rbi
{
int roi()
{
return 8;
}
}

class Hdfc extends Rbi
{
int roi()
{
return 9;
}
}

class Test
{
public static void main(String aa[])
{
Sbi s1=new Sbi();
System.out.println(s1.roi());

Hdfc h1=new Hdfc();
System.out.println(h1.roi());
}
}