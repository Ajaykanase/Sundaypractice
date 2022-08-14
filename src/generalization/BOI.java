package generalization;

public class BOI implements RBI {

	@Override
	public void deposite() {
		System.out.println("inthet only deposite 10000 in one time");
		
	}

	@Override
	public void loan() {
		System.out.println("all documents clear for that");
		
	}

	@Override
	public void transfer() {
		System.out.println("only 5000 one time transfer");
		
	}
	
	public void boiapp() {
		System.out.println(" it is own app os her");
	}

}
