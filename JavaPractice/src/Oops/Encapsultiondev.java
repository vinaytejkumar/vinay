package Oops;

public class Encapsultiondev {
	public static void main(String[] args) {
		
	Encapsultion en =new Encapsultion();
	en.setName("name");
	en.setAge(25);
	System.out.println("details"+en.toString());
	
	Address address=new Address();
	address.setArea("brm bangalore");
	address.setPincode("560029");
	address.setStreet_no("KEB layout");
	System.out.println("address"+address.toString());
	
	Company com=new Company();
	com.setCompanyName("vinay");
	com.setDomain("java developer");
	System.out.println("company details"+com.toString());
	
}
}