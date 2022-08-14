package arryuse;

public class multidimensionalarray {

	public static void main(String[] args) {
		
		int Rollno[][]=new int[2][2];
		
		Rollno[0][0]=1;
		Rollno[0][1]=2;
		Rollno[1][0]=3;
		Rollno[1][1]=4;
		
		System.out.print(Rollno[0][0]+" ");
		System.out.println(Rollno[0][1]);
		System.out.print(Rollno[1][0]+" ");
		System.out.println(Rollno[1][1]);
		System.out.println("================");
		
		for (int i = 0; i <= Rollno.length-1; i++) {
			
			for (int j = 0; j <= Rollno.length-1; j++) {
				
				System.out.print(Rollno[i][j]+ " ");
				
			}
			System.out.println();
			
		}
		System.out.println("================");
		//without new keyword
		
		String Players[][]= {{"Rohit","virat"},{"Hrdik","pant"}};
		
		for (int i = 0; i <= Players.length-1; i++) {
			for (int j = 0; j <= Players.length-1; j++) {
				
				System.out.print(Players[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
