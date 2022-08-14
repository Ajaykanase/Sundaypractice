package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vectorclassuse {

	public static void main(String[] args) {
		
		Vector v= new Vector();
		v.add(23);
		v.add("Velocity");
		v.add(null);
		v.add(null);
		v.add("Ajay");
		
		System.out.println(v);
		System.out.println(v.size());
		
		System.out.println(v.capacity());
		
		System.out.println(v.contains("Velocity"));
		
//		v.remove(3);
//		System.out.println(v);
		
		Iterator it=v.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());	
		}
		System.out.println("==================");
		for(int i=0; i<=v.size()-1;i++) {
			System.out.println(v.get(i));
		}
		System.out.println("==================");
		for(Object c:v) {
			System.out.println(c);
		}
		System.out.println("==================");
		
		ListIterator ls=v.listIterator();
		
		while(ls.hasNext()) {
			System.out.println(ls.next());
		}
		System.out.println("==================");
		Enumeration en=v.elements();
		
		while(en.hasMoreElements()) {
			
			System.out.println(en.nextElement());
		}
		
		
		
	}

}
