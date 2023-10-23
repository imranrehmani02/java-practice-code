class CBSE
{
int minfees()
{
return 12000;
}
}

class IPS extends CBSE
{
int minfees()
{
return 15000;
}
}

class RPS extends CBSE
{
int minfees()
{
return 18500;
}
}

class School 
{
public static void main(String aa[])
{
IPS i1=new IPS();
System.out.println(i1.minfees());

RPS r1=new RPS();
System.out.println(r1.minfees());
}
}