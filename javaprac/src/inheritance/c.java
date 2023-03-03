package inheritance;

 
public class c extends b{	
	
	
	public void ride() {
		System.out.println("cccccc");
	}
	
	public static void main (String [] args) {
		int[] l= {3,4};
		int h=l.length;
		
		c  C = new c();
		C.g();
		
		a b = new c ();
		int g = b.h;
		System.out.println(C.i);
		System.out.println( b.h);
		b m = new c ();
		b.all(b);
	
	}

}
