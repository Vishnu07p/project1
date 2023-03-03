package javaprac;

import java.util.Arrays;

public class code1 {
	public int get(int[] b) {
	int a = 0;
	Arrays.sort(b);
	
	for (int i =0;i<b.length-1;i++) {
		if (b[i]!=b[i+1]) {
			System.out.println(b[i]);
			
		}
		
		
	}
	System.out.println(b[b.length-1]);
	//++++++++++++++++++++++++++++++++++++++++++++
//		for (int i = 0; i < b.length; i++) {
//			boolean g = true;
//			for (int j = 0; j < i; j++) {
//				if (b[i] == b[j]) { 
//					g = false;// 5, 3, 5, 4, 5, 4, 8
//					break;
//				}
//			}
//		if (g)
//			System.out.println(b[i]);
//		}
//++++++++++++++++++++++++++++++++++++++++++
		return a;
	}

	public static void main(String[] args) {

		code1 c = new code1();

		int[] a = new int[] { 5, 3, 5,5,4,3,7,7,6,6,7,8, 4, 5, 4, 8 };
		c.get(a);

	}

}
