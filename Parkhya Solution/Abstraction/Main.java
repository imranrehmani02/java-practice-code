abstract class Rbi
{
abstract void roi();
}

class Sbi extends Rbi
{
void roi()
{
System.out.println("Sbi roi =9%");
}
}

class Hdfc extends Rbi
{
void roi()
{
System.out.println("Hdfc roi =12%");
}
}

class Bandhan extends Rbi
{
void roi()
{
System.out.println("Bandhan roi =11%");
}
}

class Main
{
public static void main(String args[])
{
Sbi s1=new Sbi();
s1.roi();
System.out.println("----------");

Hdfc h1=new Hdfc();
h1.roi();
System.out.println("----------");

Bandhan b1=new Bandhan();
b1.roi();
System.out.println("----------");
}
}