package Str1;

public class Split1 {

	public static void main(String[] args) {
		String s1="Java String split method ";
		String [] words=s1.split("\\s");
		for(String w:words)
		{
			System.out.println(w);
		}
	}

}
