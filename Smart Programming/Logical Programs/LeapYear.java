//Leap Year

class LeapYear
{
public static void main(String args[])
{
int y=2016;
if((y%400==0) || (y%4==0 && y%100!=0))
{
System.out.println(y+" Leap Year");
}
else
{
System.out.println(y+" Not a Leap Year");
}
}
}