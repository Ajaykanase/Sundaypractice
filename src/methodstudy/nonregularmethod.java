package methodstudy;

public class nonregularmethod {

	public static void main(String[] args)
	{
		employeeinfo();//static method call from same class
		StaticCallingontherclass.akshayinfo();

	}
    
	public static void employeeinfo() 
	{
		//variable declaration
		
		String emplo_name="Ajay Kanase";
		String emplo_id= "FCM2212";
		char gender='M';
		int salary=12356;
		float weight=55.6f;
		
		System.out.println("my employe name is "+emplo_name);
		System.out.println("emplo_id is "+emplo_id);
		System.out.println("gender is "+gender);
		System.out.println("my salary is"+salary);
		System.out.println("weight is "+weight);
		
	}
	
}
