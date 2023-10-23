class Bus
{
void route()
{
System.out.println("Delhi to Mumbai");
}
}

class Hansbus extends Bus
{
void route()
{
System.out.println("Delhi to Mumbai via Bhopal Nagpur");
}
}

class Rajbus extends Bus
{
void route()
{
System.out.println("Delhi to Mumbai via Ratlam Baroda");
}
}

class Or5
{
public static void main(String args[])
{
Hansbus h=new Hansbus();
h.route();

Rajbus r=new Rajbus();
r.route();
}
}