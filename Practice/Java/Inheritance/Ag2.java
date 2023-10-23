class Dummy
{
int cube(int a)
{
return a*a*a;
}

int add(int a,int b)
{
return a+b;
}
}

class Ag2 
{
public static void main(String args[])
{
Dummy d=new Dummy();
System.out.println("mult is "+d.cube(5));
System.out.println("mult is "+d.add(5,21));
}
}

class Ag3
{
public static void main(String args[])
{
Dummy d=new Dummy();
System.out.println("add is "+d.add(5,14));
}
}
