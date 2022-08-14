package Accessmodifier;

public class Privateuse {
	
	int a= 20;
	private int b=60;
	public int c=60;
	protected static int d=80;
	
	public static void main(String[] args) {
		
		Privateuse p= new Privateuse();
		p.add();
		p.mul();
		p.sub();
		display();
		
		System.out.println("value of a is "+p.a);
		System.out.println("value of b is "+p.b);
		System.out.println("value of c "+p.c);
		System.out.println("value of d is "+d);
		

	}
	
	private void add() {
		
		int a,b=10,c=20;
		a=b+c;
		
		System.out.println("value of a is "+a);
	}
	
	public void sub() {
		int a,b=30,c=35;
		a=b-c;
		System.out.println("value of a "+a);
		
		
	}
	
	void mul() {
		
		int a,b=58,c=59;
		a=b*c;
		System.out.println("value of a "+a);
		
				
	}

     protected static void display() {
    	 
    	 System.out.println("hi i am protected method");
     }
	
	
}
