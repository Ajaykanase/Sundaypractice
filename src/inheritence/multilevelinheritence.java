package inheritence;

public class multilevelinheritence {

	public static void main(String[] args) {
		
		sonclass s= new sonclass();
		s.son();
		s.grandmother();
		s.money();
		s.nature();
		Grandmotherclass.good();
		
		
		Grandmotherclass.good();
		
		mother m= new mother();
		m.grandmother();
		m.money();
		m.nature();
		Grandmotherclass.good();
		
		
		
		Grandmotherclass g = new Grandmotherclass();
		g.grandmother();
		Grandmotherclass.good();
		
		
		
		

	}

}
