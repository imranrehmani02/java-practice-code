import java.util.*;
public class LinkedHashMap1 {
public static void main(String args[])
{
LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
System.out.println("Initial list of elements :"+hm);

hm.put(101,"Amit");
hm.put(102,"Vijay");
hm.put(103,"Rahul");

System.out.println("After invoking put() method.");
for(Map.Entry m:hm.entrySet())
{
System.out.println(m.getKey()+" "+m.getValue());	
}
hm.putIfAbsent(104,"Gourav");
System.out.println("After Invoking putIfAbsent() method.");

for(Map.Entry m:hm.entrySet())
{
System.out.println(m.getKey()+" "+m.getValue());	
}
LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();

map.put(105,"Ravi");
map.putAll(hm);
System.out.println("After Invoking putAll() method");
for(Map.Entry m:map.entrySet())
{
System.out.println(m.getKey()+" "+m.getValue());	
}
}
}
