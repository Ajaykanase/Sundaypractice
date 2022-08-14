package intarfaceuse;

public class implementationsample implements mother,Father {

	public static void main(String[] args) {
		
		implementationsample A= new implementationsample();
		A.angery();
		A.behavoiur();
		A.cool();
		A.look();
		A.money();
		A.nature();
		
		

	}

	@Override
	public void money() {
		System.out.println("money can by everthing");
		
	}

	@Override
	public void look() {
		System.out.println("look is good");
		
	}

	@Override
	public void angery() {
		System.out.println("angery ");
		
	}

	@Override
	public void nature() {
		System.out.println("provide accent of us");
		
	}

	@Override
	public void behavoiur() {
		System.out.println("create professionalisum");
		
	}

	@Override
	public void cool() {
		System.out.println("usefull for work");
		
	}

}
