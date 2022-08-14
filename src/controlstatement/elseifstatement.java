package controlstatement;

public class elseifstatement {

	public static void main(String[] args) {
		
		//if i got greater than equal to 90 i am n dist
		//else if i got mark>=66 and mark<=90 i am in second class
		// else if i got mark>=50 and mark<=66 i am in third class
		//else mark<=50 i am fail
		
		int mark=45;
		
		if (mark>=90) {
			System.out.println("i am in dist");
			
		}
		else if (mark>=66 & mark<=90) {
			System.out.println("i am in second class");
			
		}
		else if (mark>=50&mark<=6) {
			System.out.println("i am in third class");
		}
		
		else {
			System.out.println("i am fail");
			
		}
	}

}
