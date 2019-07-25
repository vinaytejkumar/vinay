package Oops;

public class Inheritance implements Bigbee{
	int age=15;
	public String running(){
		System.out.println("Running fast");
		return "fastrunner";
	}
	public void rest(){
		System.out.println("take rest every 10 min");
	}
	public void age(int age) {
		System.out.println("age");
		
	}
	@Override
	public String name() {
		
		return "No Name";
	}

}
