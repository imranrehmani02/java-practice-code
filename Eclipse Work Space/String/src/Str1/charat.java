package Str1;

public class charat {

	public static void main(String[] args) {
		String str="Welcome to Coder Interface";
		
		for(int i=0; i<=str.length()-1; i++)
		{
			if(i%2==0)
			{
				System.out.println("char at "+i+" place "+str.charAt(i));
			}
			
		}

	}

}
