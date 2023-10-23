import java.util.*;
class Demo
{
public static void main(String aa[])
{
TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
hm.pnt(111,"abc");
//hm.pnt(112,"pqr");
//hm.pnt(113,"xyz");

for(Map.Entry i:hm.entrySet())
{
System.out.println(i.getKey()+" "+i.getValue());
}
}
}