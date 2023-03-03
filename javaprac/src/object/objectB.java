package object;

import java.util.ArrayList;
import java.util.List;

import javaprac.interfaces;

public class objectB extends objectA {
	int a=8;
	int b=9;
	public void book() {
		System.out.println("hello object B");
		
	}
public static void main( String []args) {

objectA  f = new objectA();
System.out.println(f.a);
System.out.println(f.b);
f.book();
objectB f1 = new objectB();

System.out.println(f1.a);
System.out.println(f1.b);
f1.book();
objectA f2 = new objectB();
f2.book();
System.out.println(f2.a);
System.out.println(f2.b);

List<Integer > l = new ArrayList<>();
l.add(3);
l.add(4);
l.get(0);
l.get(1);
System.out.print(l.get(0) - l.get(0));


}
}