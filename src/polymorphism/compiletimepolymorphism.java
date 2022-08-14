package polymorphism;

public class compiletimepolymorphism {

	public static void main(String[] args) {
		
		compiletimepolymorphism co=new compiletimepolymorphism();
		co.akshay();
		co.akshay(30);
		co.akshay(50, 100);
		akshay(24, 50, 100);
		

	}

	public void akshay() {
		    System.out.println("my name is akshay");
	}
	
	public void akshay(int a) {
		
		a=30;
		int sum=a+20;
		System.out.println("sum is "+sum);
	}
	
	public void akshay(int a, int b) {
		
		int sum= a+b;
		System.out.println("sum is "+sum);
	}
	
	public static void akshay(int a, int b, int c) {
		
		int sum=a+b+c;
		System.out.println("sum is "+sum);
	}
}
