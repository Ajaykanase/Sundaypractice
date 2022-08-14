package abstractuse;

public class Concretclass extends Abstractclass {

	public static void main(String[] args) {
		
		Concretclass co =new Concretclass();
		co.ajay();
		co.akshay();
		co.test();
		co.test1();
		co.test3();
		

	}

	@Override
	public void test() {
		System.out.println("it is abstract method declere in concret");
		
	}

	@Override
	public void test1() {
		System.out.println("it is same as test one method");
		
	}

	@Override
	public void test3() {
		System.out.println("it has same as test2 method ");
	}

}
