public class setget
{
private int a;
private double b;
private String name;


public void setA(int a)
{
this.a=a;
}

public int getA()
{
return a;
}

public void setB(double b)
{
this.b=b;
}

public double getB()
{
return b;
}

public void setName(String name)
{
this.name=name;
}

public String getName()
{
return name;
}
public static void main(String args[])
{
setget ob=new setget();
ob.setA(102);
ob.setB(555.3);
ob.setName("Abc");
System.out.println(ob.getA());
System.out.println(ob.getB());
System.out.println(ob.getName());
}
}