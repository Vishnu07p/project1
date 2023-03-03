package javaprac;

public class maxandmin {





public static void main(String[] args) {
int[][] a = {{20,23,3},{2,4,5},{42,4,3}};
int c = 0;
int min=a[0][0];
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		if(a[i][j]>min) {
		min = a[i][j];
		c =j;
		
		}
		
	}
}
System.out.println(min);
System.out.println(c);
int k=0;
int g=a[0][c];
while(k<3) {
	
	if (a[k][c]<g) {
		
		g=a[k][c];
	
	}
	k++;
}
System.out.println(min);
System.out.print(g);
       



}
}
