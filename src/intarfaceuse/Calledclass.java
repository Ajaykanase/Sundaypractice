package intarfaceuse;

public class Calledclass implements Ajayclass,Akshayclass {

	public static void main(String[] args) {
		
		Calledclass c= new Calledclass();
		c.test1();
		c.test2();
		c.test3();
		c.test4();
		c.look();
		c.nature();
		

	}

	@Override
	public void test3() {
		System.out.println("test3");
		
	}

	@Override
	public void test4() {
		System.out.println("tets4");
		
	}

	@Override
	public void test1() {
		System.out.println("test1");
		
	}

	@Override
	public void test2() {
		System.out.println("test2");
		
	}

}
