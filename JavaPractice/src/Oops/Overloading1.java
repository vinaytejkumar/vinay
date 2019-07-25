package Oops;

 class Overloading2{
	void run(){
		System.out.println("hello guru");
	}
 }
	 class Overloading1 extends Overloading2{
		void run(){
			System.out.println("iam updated");
		}
		public static void main(String[] args) {
			Overloading1 over=new Overloading1();
			Overloading2 over1=new Overloading1();
			Overloading2 over2=new Overloading2();
			over.run();
			//
			
			
		}
	}

