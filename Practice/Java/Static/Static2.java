class Student
{
int id;
String name;
static String course="core java";

Student(int i, String n)
{
id=i;
name=n;
}

void pass()
{
course="Adv. Java";
}

void show()
{
System.out.println(id+" "+name+" "+course);
}
}

class Static2
{
public static void main(String args[])
{
Student s1=new Student(101,"Raj");
Student s2=new Student(102,"Ankit");
Student s3=new Student(103,"Vasudev");

s1.pass();
s1.show();
s2.show();
s3.show();
}
}