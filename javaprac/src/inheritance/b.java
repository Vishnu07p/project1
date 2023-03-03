package inheritance;

public class b extends a{
	
	int i = 20;
 public void ride() {
	System.out.println("bbbbbbb");
 }
	
	public void book() {
		
		System.out.println("b");
	}
	public static void main (String [] args) {
		

		
		a A = new a();
		A.g();
		a a2 = new b();
		a2.g();
		System.out.println(a2.i);

		
		
	}
	
	
	

}
