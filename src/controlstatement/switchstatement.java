package controlstatement;

public class switchstatement {

	public static void main(String[] args) {
		
		int day=5;
		
		switch (day) {
		case 1:
			System.out.println("that is monday");
			break;
		case 2:
			System.out.println("that is tuesday");
			break;
		case 3:
			System.out.println("that is wensday");
			break;
		case 4:
			System.out.println("that is tursday");
			break;
		case 5:
			System.out.println("that is friday");
			break;
		case 6:
			System.out.println("that is saturday");
			break;
		case 7:
		    System.out.println("that is sunday");
		    break;

		default:System.out.println("please enter vali day withen 1 to 7 no");
			break;
		}
		

	}

}
