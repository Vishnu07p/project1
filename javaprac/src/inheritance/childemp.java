package inheritance;

import javaprac.leet;

public class childemp extends parentemp {
childemp(String n, int s, int b) {
		super(n, s);
		bonus = b;
		// TODO Auto-generated constructor stub
	}

 private int bonus ;
public int getbonus() {
	return bonus;
}
	public static void main( String [ ]args) {
	a a1 = new a();
	
System.out.println(	a1.getClass());
Class  c = a1.getClass();
System.out.println(c.getName());
int h = 	a1.h;

leet l = new leet ();

	}
//public int getsalary() {
//	return super.getsalary() + bonus;
//}

}
