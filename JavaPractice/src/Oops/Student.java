package Oops;

public class Student extends Details{
	public final static Double PI=3.17;
	int classcapacity;
	int numberofclasses;
	double radius;
	String Address;
	public Student(int Identity, String FirstName, String LastName,String Addess) {
		super(Identity, FirstName, LastName);
		this.Address=Addess;
	}

public Student(String Company,Double salary){
	super(Company,salary);
	
}

@Override
double numbers() {
	// TODO Auto-generated method stub
	return PI*(radius*radius);
}
}



