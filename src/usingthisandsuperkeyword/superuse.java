package usingthisandsuperkeyword;

public class superuse extends subclass {
	
	static int a=50;

	public static void main(String[] args) {
		superuse s= new superuse();
		s.display();
		System.out.println("value of a is "+s.a);
		System.out.println("value of b is "+s.b);
		
		
      System.out.println("value of a "+a);
	}
    
	public void display() {
		
		int a=90;
		System.out.println("value of a is "+a);
		
		 int sum=super.a+50;
		 int sum1=super.b+30;
		 
		 System.out.println(sum);
		 System.out.println(sum1);
		 
	}
}
