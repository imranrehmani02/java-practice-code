interface Veg
{
void paneer();
}

interface Nonveg
{
void chicken();
}

class Hotel implements Veg,Nonveg
{
public void paneer()
{
System.out.println("Paneer Specials :- Kaju Paneer,Matar Paneer,Paneer Tikka,Shahi Paneer");
}
public void chicken()
{
System.out.println("Chicken Specials :- Butter Chicken,Chicken Angara,Chicken Makhmali,Chicken Masala,Chicken Tandoori");
}
public static void main(String args[])
{
Hotel ht=new Hotel();
ht.paneer();
ht.chicken();
}
}