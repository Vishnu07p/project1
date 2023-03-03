package javaprac;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int k =3; for(int i=1;i<=4;i++) { for(int j =1; j<=i;j++) {
		 * System.out.print(k+ " "); k=k+3; } System.out.println("");
		 */
		int i[][] = new int[2][3];
		i[0][0] = 1;
		i[0][1] = 2;
		i[0][2] = 3;
		i[1][0] = 4;
		i[1][1] = 5;
		i[1][2] = 6:
		int h = i[0][0];
		int c=0;
		

		for (int k = 0; k < 2; k++) {

			for (int j = 0; j < 3; j++) {
			if (i[k][j] < h) {
				h = i[k][j];
				c= j;
			}
			}
			
		}
		int z = i[0][c];
		
		for (int r=0; r<2;r++) {
			if(i[r][c]>z) {
				z=i[r][c];
			}
		}
		System.out.println(z);
	}

}
