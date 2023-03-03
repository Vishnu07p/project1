package javaprac;

public class loop1 {
	 public static void i (String S) {
		System.out.print(S );
	}

	public static void main(String[] args) {
		triangle tr = new triangle();
		System.out.println(tr.g);
		// TODO Auto-generated method stub
//		int k =1;
//		for(int i = 1;i<=4;i++) {
//			
//			
//			for (int j=1;j<=5-i;j++) {
//				
//				System.out.print(k++ + " ");
//			}
//		System.out.println
//		(" ");
//		}
int k=3;
for(int i=1; i<=4;i++) {
	for (int j=1;j<=i;j++){
		System.out.print(k + " i love kavitha ");
		k +=3;
	}
	System.out.println(" ");

	
} i("vishnnu");



	}

}
