import java.util.StringTokenizer;
class Demo
{
public static void main(String aa[])
{
StringTokenizer st=new StringTokenizer(" we are learning java"," ");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
}
}

//public boolean hasMoreTokens();
//public string nextToken();