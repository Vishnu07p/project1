package oops;

public class stack {
	String[] list = new String[4];
	int tos;

	stack() {

		tos = -1;
	}

	void push(String item) {

		if (tos >= 3) {
			System.out.println("Stack is full");
		} else {
			list[++tos] = item;
		}
	}

	String pop() {
		if (tos >= 0)

			return list[tos];

	
		return "stack is empty";
	}

}
