class C
{
int id;                      //instance variable
String name;            //instance variable
public static void main(String aa[])
{
C c1=new C();

System.out.println(c1.id);
System.out.println(c1.name);

c1.id=1011;
c1.name="Abhi";
System.out.println(c1.id+" "+c1.name);

C c2=new C();
System.out.println(c2.id=2011);
System.out.println(c2.name="Rahul");
}
}