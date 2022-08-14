package methodstudy;

public class Nonstaticregularmethod {

	public static void main(String[] args) 
	{
		Nonstaticregularmethod n= new Nonstaticregularmethod();
		n.playerinfo(); // calling from same class
		
		nonstaticmethodcaliingforontherclass m= new nonstaticmethodcaliingforontherclass();
		m.ontherplayer();//calling for different class
	}

	public void playerinfo() 
	{
		String name="Rohit sharma";
		String role="Batsmen";
		char gender='M';
		int gerceyno = 45;
		float weight = 7502f;
		
		System.out.println("my name is "+name);
		System.out.println("role is "+role);
		System.out.println("gender is "+gender);
		System.out.println("gercey no is "+gerceyno);
		System.out.println("weight of player is "+weight);
	}
	
}
