package arryuse;

public class singledimensionalarrey {

	public static void main(String[] args) {
		//arry declaration
         String city[]=new String[6];
         
         //inilization
         
         city[0]="Satara";
         city[1]="kholapur";
         city[2]="nashik";
         city[3]="pune";
         city[4]="latur";
         city[5]="goa";
         
         //usage
		
         System.out.println(city[0]);
         System.out.println(city[1]); 
         System.out.println(city[2]);
         System.out.println(city[3]);
         System.out.println(city[5]);
         System.out.println("==================");
         
         for (int i =0; i<=3; i++) {
        	 System.out.println(city[i]);
		}
         
         System.out.println("==================");
         
         
         for (int i = 0; i <= city.length-1; i++) {
			System.out.println(city[i]);
		}
         System.out.println("==================");
         
         for (int i = 3; i >=0; i--) {
			System.out.println(city[i]);
		}
         System.out.println("==================");
         
         for (int i = city.length-1; i >= 0; i--) {
			System.out.println(city[i]);
		}
         System.out.println("==================");
         
         //we decleare without new keyword
         
         
         String No[]= {"ajay", "dhirraj","onkar"};
         
         System.out.println(No[2]);
         
         System.out.println("==================");
         for (int i = 0; i <= No.length-1; i++) {
			System.out.println(No[i]);
		}
         
         
         
	}

}
