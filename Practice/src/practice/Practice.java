package practice; //package name

public class Practice {  //class name
	public void myPractice() { // method 1
		System.out.println("This is the output of void method");  //syso ctrl+ space is shortcut
	}
	public static void outputTwo() { //method 2
		System.out.println("This the output of static method");
	}
	// My Main method
	public static void main(String[] args) {  // main ctrl+space
		Practice P = new Practice();  // assigning object for a class
		// P.myPractice(); //This way of calling is method by object is done for public void method
		Practice.outputTwo(); //calling the method with class name is done for public static void
	}
}
