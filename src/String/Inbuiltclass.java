package String;

public class Inbuiltclass {

	public static void main(String[] args) {
		
	   // use of index of method
		
		String s1="cool";
		int index = s1.indexOf('o');
		System.out.println(index);
		
		String s2= "india is a biggest country";
		
		System.out.println(s2.indexOf('i'));
		System.out.println(s2.lastIndexOf('i'));
		System.out.println(s2.indexOf('i', 1));
		System.out.println(s2.indexOf('i', 4));
		System.out.println(s2.indexOf('i',7 ));
		
		//use of replace 
		
		String s3= "maharashtra" ;
		
		System.out.println(s3.replace('r', 'o'));
		System.out.println(s3.replace("maharashtra", "india"));
		System.out.println(s3.replaceAll("maha", "goa"));
		
		//use concat method
		
		String m1="ajay";
		String m2=" onkar";
		String m3=" sid";
		String m4=" abhinandhan";
		
		System.out.println(m1.concat(m2).concat(m3).concat(m4));
		
		//use of substring method
		
		String a1= "govofindia";
		
		System.out.println(a1.substring(1));
		System.out.println(a1.substring(3, 7));
		System.out.println(a1.subSequence(0, 9));
		
		
		
		}
		

}
