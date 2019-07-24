package Oops;

abstract class Details {
	private int Identity;
	String FirstName;
	String LastName;
	private String Company;
	private Double salary;
	private double fees;
	private String collage;
	abstract double numbers();

	public Details(int Identity,String FirstName,String LastName){
		this.Identity=Identity;
		this.FirstName=FirstName;
		this.LastName=LastName;
		}
	
	public Details(String Company,Double Salary){
		this.Company=Company;
		this.salary=Salary;
	}
	public Details(Double fees,String collage){
		this.fees=fees;
		this.collage=collage;
	}
	
}
