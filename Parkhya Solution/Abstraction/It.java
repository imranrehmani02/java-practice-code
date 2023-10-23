abstract class Company
{
abstract void salary();
abstract void break_time();
}

class Designer extends Company
{
void salary()
{
System.out.println("Designer salary=18000");
}
void break_time()
{
System.out.println("Designer break time :-01:00 to 01:30");
}
}

class Developer extends Company
{
void salary()
{
System.out.println("Developer salary=22000");
}
void break_time()
{
System.out.println("Developer break time :-01:30 to 02:00");
}
}

class It
{
public static void main(String args[])
{
Designer d1=new Designer();
Developer d2=new Developer();
System.out.println("----------------------------");
d1.salary();
d1.break_time();
System.out.println("----------------------------");
d2.salary();
d2.break_time();
System.out.println("----------------------------");
}
}