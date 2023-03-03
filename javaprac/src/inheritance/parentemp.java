package inheritance;

import java.util.ArrayList;

public class parentemp {
	private String name;
	private int salary;
	   parentemp(String n, int s){
		   name = n;
		   salary = s;
	   }
	   
	   public   void setname(String n) {
		   
		   name =  n;
	   }
	   public void gettname() {
		   System.out.println(name);
	   }
public void setsalary(int s) {
	salary = s;
}
public int getsalary() {
	return salary;
}
parentemp(){
	System.out.println("fsegfws");
}


public static void main(String[] args) {
	parentemp e1 = new parentemp("vishnu", 50000);
	e1.gettname();
	e1.setname("vishnu1");
	e1.gettname();	
	childemp m1 = new childemp("vi",60000,4000);
	//System.out.println(m1.getbonus());
	//System.out.println(m1.getsalary());
	System.out.println(e1.getsalary());
	//childemp m2 = new childemp(4000);
//	System.out.println("*************");
//m2.gettname();
//System.out.println(m2.getsalary());
	ArrayList<childemp> c = new ArrayList<>();
	c.add(new childemp("vishnuhkh",40000,44));
	c.add(new childemp("hnuhkh",40000,44));
	for (childemp v : c) {
		v.getsalary();
		v.gettname();
	}
	
	
	
	
	
	
	
}
}

