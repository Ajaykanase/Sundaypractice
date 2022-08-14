package controlstatement;

public class nestedifstatement {

	public static void main(String[] args) {
		
		String UN="AJAY";
		String password="ITBP00326";
		
		if (UN=="AJAY") {
			System.out.println("UN IS CORRECT PLEASE ENTER PASSWORD");
			
	    if (password=="ITBP00326") {
			System.out.println("LOGIN SUCCESSFULLY");
				
			}
	    else {
			System.out.println("invalid password please enter correct password");
		}
	    
	    
		}
		
		else {
			System.out.println("invalid username please inter corrct username");
		}

	}

}
