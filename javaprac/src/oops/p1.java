package oops;

public class p1 {
private static int i ;
private int h ;
private String b ;

int l;
int j ;
int k ;
public p1 vv() {
	return  new p1();
}

p1(int L, int J , int K){
	l = L;
	j= J;
	k  = K;
}
p1(){
	
}
 p1(int y , int h , String k) {
	this.i = y;
			this.h=h;
	this.b=k; 
	
	
}
 public  void h(String f , int gg, int ll) {
	 this.i = gg;
		this.h=ll;
this.b=f;
	System.out.println( i*h);
	 System.out.println(b);
 }
	public static void main(String[] args) {
		i =8;
		
	
		p1 c = new p1(4,3,"vsvsv");
		c.h("wcwcw",32,23);
		
		String g = "vishnu prasath";
		 for (int i =g.length()-1; i>=0;i--) {
			System.out.println( g.charAt(i));
			 
		 }
		 int i=3;
		String yy =  i>4?"yes":"no";
		System.out.print(yy); 
		max("DAa","as");
		
		

	}
public static String max(String ff, String gg) {
	
	
	return ff.length()>gg.length()?ff:gg;
	
	
	
}
boolean isequal(p1 p) {
	
	if(l==p.l && j == p.j&& k == p.k)
		return true;
	return false;
	
}

}
