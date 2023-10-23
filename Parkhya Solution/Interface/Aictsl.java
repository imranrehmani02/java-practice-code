interface City_Bus
{
void route11();
void route12();
static void route13()
{
System.out.println("Bhawarkua to Rajwada");
}
}

interface Intercity_Bus
{
default void route21()
{
System.out.println("Indore to Dhar");
}
void route22();
void route23();
}

class Aictsl implements City_Bus,Intercity_Bus
{
public void route11()
{
System.out.println("MY to Navlakha");
}

public void route12()
{
System.out.println("MR9 to Palasia");
}

public void route22()
{
System.out.println("Indore to Dhar");
}

public void route23()
{
System.out.println("Indore to Ujjain");
}
public static void main(String args[])
{
Aictsl bus=new Aictsl();
bus.route11();
bus.route12();
City_Bus.route13();
bus.route21();
bus.route22();
bus.route23();
} 
}