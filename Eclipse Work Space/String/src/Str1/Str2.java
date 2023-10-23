package Str1;

public class Str2 {

	public static void main(String[] args) {
String s1="code";
String s2="coder";
String s3="code";
String s4="coder";

System.out.println(s1.contentEquals(s2));
System.out.println(s1.contentEquals(s3));
System.out.println(s1.contentEquals(s4));
System.out.println("------------------------------");

System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s1==s4);
System.out.println("-------------------------------");

System.out.println(s1.compareTo(s2));
System.out.println(s1.compareTo(s4));
System.out.println(s1.compareTo(s3));
System.out.println(s2.compareTo(s3));
}

}
