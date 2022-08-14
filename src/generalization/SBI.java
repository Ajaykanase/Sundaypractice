package generalization;

public class SBI implements RBI {


	@Override
	public void deposite() {
		
		System.out.println("deposite is maximaum in one time 50000");
	}

	@Override
	public void loan() {
		System.out.println("all documents clear of user than only we pass the loan ");
		
	}

	@Override
	public void transfer() {
		System.out.println("in one time only tansfer 1000 ");
		
	}
	
	public void ownapp() {
		System.out.println("SBI is own app of that bank");
	}

}
