package Accesssample;

import Accessmodifier.Privateuse;

public class sampleclass extends Privateuse  {

	public static void main(String[] args) {
		sampleclass s= new sampleclass();
		s.sub();
		Privateuse.display();
		
		System.out.println("value of a "+s.c);
		System.out.println("value of static "+s.d);
		

	}

}
