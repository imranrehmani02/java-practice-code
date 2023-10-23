class Calc
{
int add(int a,int b)
{
return a+b;
}
int mul(int a,int b)
{
return a*b;
}
}

class Scalc extends Calc
{
int cube(int k)
{
    return k*k*k;
}
public static void main(String aa[])
{
Scalc s=new Scalc();
System.out.println("cube is "+s.cube(7));
}
}




class Demo extends Calc
{
void show()
{
System.out.println("\\CALC//");
}
public static void main(String gg[])
{
Demo d=new Demo();
d.show();
Scalc.main(null);
System.out.println("add is "+d.add(12,20));
System.out.println("mul is "+d.mul(20,3));
}
}