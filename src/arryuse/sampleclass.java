package arryuse;

public class sampleclass {

	public static void main(String[] args) {
		
		//Array declaration
		
		String city[]=new String[7];
		
		city[0]="pune";
		city[2]="beed";
		city[1]="satara";
		city[3]=null;
		city[4]="goa";
		
		
		System.out.println(city[0]);
		System.out.println(city[1]);
		System.out.println(city[2]);
		System.out.println(city[3]);
		System.out.println(city[4]);
		
		
		
		int rollno[]=new int[3];
		
		int rollno1[]= {1,2,3,4,5,6,7,8};
		
		System.out.println(rollno1[3]);
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			
		}
		System.out.println("======================");
		
		for (int i = 0; i <= rollno1.length-1; i++) {
			System.out.println(i);
			
		}
		System.out.println("======================");

		for (int i = 6; i>= 0; i--) {
			System.out.println(i);
		}
		System.out.println("======================");
		for (int i =rollno1.length-1 ; i>=0; i--) {
			System.out.println(i);
		}
		
		System.out.println("======================");
		//without new keyword
		
		String citys[]= {"pune","Satara","beed","latur"};
		
		System.out.println(citys[1]);
		System.out.println(citys[0]);
		System.out.println(citys[3]);
		System.out.println(citys[2]);
		System.out.println("======================");
		
		for (int i = 0; i <= citys.length-1; i++) {
			System.out.println(citys[i]);
		}
	}

}
