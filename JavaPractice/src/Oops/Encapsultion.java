package Oops;

public class Encapsultion {
	
	private String Name;
	private int Age;
	private Address Address;
	private Company companydetails;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}
	public Company getCompanydetails() {
		return companydetails;
	}
	public void setCompanydetails(Company companydetails) {
		this.companydetails = companydetails;
	}
	@Override
	public String toString() {
		return "Encapsultion [Name=" + Name + ", Age=" + Age + ", Address=" + Address + ", companydetails="
				+ companydetails + "]";
	}
	
}
