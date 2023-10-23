package encap2;

public class Cust {
	public static void main(String args[])
	{
		Bike b1=new Bike();
		b1.setRegno(458796565l);
		b1.setName("Ashu");
		b1.setModel("pulsar");
		b1.setPrice(55600f);
		
		System.out.println(b1.getRegno()+" "+b1.getName()+" "+b1.getModel()+" "+b1.getPrice());
	}

	

}
