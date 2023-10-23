import java.util.*;
public class ArrayList2
{
public static void main(String args[])
{
ArrayList nm=new ArrayList();
nm.add("abhi");
nm.add("babar");
nm.add("manoj");
System.out.println(nm);

nm.set(1,"Bhawna");
System.out.println(nm);

nm.remove(1);
System.out.println(nm);

}
}