package Encap1;

public class Test {

	public static void main(String[] args) {
		Account acc=new Account();
		acc.setAcc_no(12543985l);
		acc.setName("Lokesh");
		acc.setEmail("lokesh@g.com");
		acc.setAmount(560000f);
		
		System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
	}

}
