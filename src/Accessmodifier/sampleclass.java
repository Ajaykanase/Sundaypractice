package Accessmodifier;

public class sampleclass {

	public static void main(String[] args) {
		
		Privateuse d=new Privateuse();
		d.mul();
		d.sub();
		Privateuse.display();
		
		System.out.println("value of a "+d.a);
		System.out.println("value of c is "+d.c);
		System.out.println("value of d is "+d.d);
		

	}

}
