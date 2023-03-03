package oops;

public class stacticvariable {
int g = 7;
int gh =2;
static int l ;
static {
	l = 0;
}
stacticvariable (){
	l += 5;
}
public static void main(String[] args) {
	stacticvariable v = new stacticvariable();
	stacticvariable v1= new stacticvariable();
	stacticvariable v2 = new stacticvariable();
	stacticvariable v3 = new stacticvariable();
	
	
	System.out.print(l);
	
	
	
	
}
}
