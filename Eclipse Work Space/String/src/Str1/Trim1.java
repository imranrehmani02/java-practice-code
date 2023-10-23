package Str1;

public class Trim1 {

	public static void main(String[] args) {
		
		String s1="   Hello Java String   ";
		System.out.println(s1);
		System.out.println(s1.length());
		
		String tr=s1.trim();
		
		System.out.println(tr.length());
		System.out.println(tr);
	}

}
