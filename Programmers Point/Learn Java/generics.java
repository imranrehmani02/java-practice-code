class Demo<T>
{
T a;
void setValue(T a)
{
this.a=a;
}
T getValue()
{
return a;
}
public static void main(String aa[])
{
Demo<Integer> d=new Demo<Integer>();
d.setValue(12);
System.out.println(d.getValue());
}
}