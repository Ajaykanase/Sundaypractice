package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arryclassuse {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add("Ajay");
		al.add("Akshay");
		al.add("Vicky");
		al.add("Guari");
		al.add("kalyani");
		al.add("Ashish");
		al.add("Prajkta");
		al.add("Ajay");
		
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println(al.indexOf("Ashish"));
		System.out.println(al.lastIndexOf("Ajay"));
		
		
        
		al.set(3, "Aadharesh");
		System.out.println(al);
		
		System.out.println(al.isEmpty());
		
		System.err.println(al.contains("Akshay"));
		
		System.out.println(al.get(6));
		
		al.add("Killer");
		System.out.println(al);
		
//		Iterator it= al.iterator();
//		while(it.hasNext()) {
//			
//			System.out.println(it.next());
//		}
		
//		for(int i=0; i<=al.size()-1; i++) {
//			
//			System.out.println(al.get(i));
//		}
//		
//		
		for(Object B:al) {
			System.out.println(B);
		}
		
	}

}
