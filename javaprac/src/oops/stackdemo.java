package oops;

import javaprac.triangle;

public class stackdemo {
	public static void main(String args[]) {
		stack  s1= new stack();
		p1 pd = new p1();
	s1.push("vishnu");
//		s1.push("prasath");
//		
//		s1.push("prasath2");
//		s1.push("prasath3");
//		s1.push("prasath6");
		System.out.println(s1.pop());
		pd.max("vishnu", "acac");
		
		p1 p = new p1(4,3,1);
		p1 p2 = new p1(4,3,1);
		System.out.println(p.isequal(p2));
		p1 p3 = p2;
		p1 d = new p1();
		p1 bb = d.vv();
		triangle.ggg();
		
		
	}
	

}
