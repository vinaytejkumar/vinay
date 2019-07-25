package Oops;

class  Hello {
	
	static int add(int a,int b){
		return a+b;
	}
	static  double add(int a,int b,int c){
		return 12.0;
	}
}
 class Overloading{
		public static void main(String[] args) {
			Hello over=new Hello();
		System.out.println(over.add(1, 2, 3));
			
		}
	}
