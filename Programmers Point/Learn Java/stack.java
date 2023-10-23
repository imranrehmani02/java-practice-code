import java.util.*;
class Demo
{
public static void main(String aa[])
{

Stack<String> st=new Stack<String>();
st.push("aaa");
st.push("bbb");
st.push("ccc");

st.pop(); 
st.pop();
st.pop();

if(st.isEmpty())
{
System.out.println("stack is empty");
}
else
{
for(String s:st)
{
System.out.println(s);
}
}
}
}