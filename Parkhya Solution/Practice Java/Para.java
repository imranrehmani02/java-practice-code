class Para
{
int id;
double num;

void insert(int i,double n)
{
id=i;
num=n;
}

void show()
{
System.out.println(id+" "+num);
}

public static void main(String args[])
{
Para p=new Para();
p.insert(101,52.66);
p.show();
}
}