package intarfaceuse;

public class Implementationclass implements myinterface {

	public static void main(String[] args) {
		
		
		Implementationclass io=new Implementationclass();
		io.ajay();
		io.ajay1();
		io.akshay();
		io.akshay1();
		
		

	}

	@Override
	public void ajay() {
		System.out.println("ajay is completed in that class");
		
	}

	@Override
	public void akshay() {
		System.out.println("akshay is completed here");
		
	}

	@Override
	public void ajay1() {
		System.out.println("ajay is done here");
		
	}

	@Override
	public void akshay1() {
		System.out.println("akshay is fullfill here");
		
	}

}
