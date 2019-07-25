package Oops;

public class Constructor {
    private String name;
	private int  age;
	Constructor(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	
	public void display(){
		System.out.println(name+" "+age);
	}
	public static void main(String[] args) {
		Constructor c=new Constructor("vinay", 25);
		Constructor C1=new Constructor("vilok", 22);
		c.display();
		C1.display();
		System.out.println(c.name+" "+c.age);
		
}

}
