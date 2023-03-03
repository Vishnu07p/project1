package javaprac;

public class LTGT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (0>=0) {
			System.out.println("hello");
		}
		
		
for(int i =0;i<5;i++) {
	
	for(int j = 0;j<i;j++) {
		
		if (i==j) {
			
			break;
		}
		System.out.println("out" + j+"   "+j);
		System.out.println("out" + i);
		
	}
}
	}

}
