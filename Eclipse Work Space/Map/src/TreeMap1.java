import java.util.Iterator;
import java.util.TreeMap;
public class TreeMap1 {

	public static void main(String[] args) {
		TreeMap<Integer,String> pairs=new TreeMap<>();
		pairs.put(2,"B");
		pairs.put(3,"C");
		pairs.put(1,"A");
		String value=pairs.get(3);
		System.out.println(value);
		value=pairs.getOrDefault(5,"oops");
		System.out.println(value);
		
		Iterator<Integer> iterator=pairs.keySet().iterator();
		
		while(iterator.hasNext())
		{
			Integer key=iterator.next();
			System.out.println("key :"+key+", value : "+pairs.get(key));
		}
		pairs.remove(3);
		System.out.println(pairs);
		System.out.println(pairs.containsKey(1));
		System.out.println(pairs.containsValue("B"));
		System.out.println(pairs.ceilingKey(2));
	}

}
