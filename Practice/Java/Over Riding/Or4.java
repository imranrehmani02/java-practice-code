class CBSE
{
int fees()
{
return 15000;
}
}

class IPS extends CBSE
{
int fees()
{
return 18000;
}
}

class DPS extends CBSE
{
int fees()
{
return 16000;
}
}

class Or4 
{
public static void main(String args[])
{
IPS i=new IPS();
System.out.println(i.fees());

DPS d=new DPS();
System.out.println(d.fees());
}
}