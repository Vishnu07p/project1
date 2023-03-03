package javaprac;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Variable {
	public static void main(String[] args) {
		triangle tr = new triangle();
		tr.g=22;
		int a = 10;
		a= 0 + 10;
		System.out.println(a);
		
		boolean b = true;
				b=10>11;
				System.out.println(a+""+b+"vishnu");
				
				int[] c = new int[5];
				c[0]=1;
				c[1]=2;
				c[2]=3;
				c[3]=4;
				System.out.println(c[4]);
				System.out.println(c[4]);
				System.out.println(c[4]);
				c[4]=5;
				System.out.println(c[4]);
				System.out.println(c[4]);
				System.out.println(c[4]);
				c[4]=10;
				System.out.println(c[4]);
				System.out.println(a/2);
				System.out.println(7%2);
				System.out.println("----------------");
				
				int[] prime = {1,2,3,4,5,6,7,8,9,10,13,17,19};
				for (int p:prime) {
					if(p%2!=0 & p%3!=0 ) {
						System.out.println(p);
					}
					
				}
				System.out.println("----------------");
				for( int p:prime) {
					System.out.println(p);
				}
				String m="vishnu prasath viju"; 
			String[] n = (m.split(" "));
			ggg();
				
				
	}

}
