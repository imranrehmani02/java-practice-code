class Cln1 implements Cloneable
{
int rollno;
String name;

Cln1(int rollno,String name)
{
this.rollno=rollno;
this.name=name;
}
public Object clone() throws CloneNotSupportedException
{
return super.clone();
}
public static void main(String args[])
{
try
{
Cln1 c1=new Cln1(101,"Sourabh");
Cln1 c2=(Cln1)c1.clone();

System.out.println(c1.rollno+" "+c1.name);
System.out.println(c2.rollno+ " "+c2.name);
}
catch(CloneNotSupportedException e)
{
}
}
}