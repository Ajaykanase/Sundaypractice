package usingthisandsuperkeyword;

public class Thisclass {
	
	int a=20;
	int b=30;
	int c=60;

	public static void main(String[] args) {
		Thisclass t=new Thisclass();
		t.good();
	   System.out.println("the value of a "+t.a);
	   System.out.println("the value of b "+t.b);
	   System.out.println("the value of c is "+t.c);

	}
	
	public void good() {
		
		int a=30;
		int b=60;
		int c=30;
		
		int sum=this.a+this.b+this.c;
		System.out.println(" sum is "+sum);
	}

}
