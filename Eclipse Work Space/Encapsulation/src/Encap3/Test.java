package Encap3;

public class Test {

	public static void main(String[] args) {
		Account ac=new Account();
		ac.setAcc_no(123456789);
		ac.setName("Parkhya Solution");
		ac.setEmail("parkhya@y.com");
		ac.setAmount(35000.25f);
		
		System.out.println(ac.getAcc_no());
		System.out.println(ac.getName());
		System.out.println(ac.getEmail());
		System.out.println(ac.getAmount());
	}

}
