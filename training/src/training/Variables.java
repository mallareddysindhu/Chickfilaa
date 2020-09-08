package training;

public class Variables {
	int x=20; // This value can be changed as per need in program
	public static int y=20; //This value is constant everywhere in program
	public void localVariable() {
		int x = 10;
		System.out.println("Local variable is : " +x); //+ concatenation
		}
	public void globalVariable() {
		System.out.println("Global variable is :" +x);
	}
	public void staticVariable() {
		System.out.println("static variable is :" +y);
	}
	public static void main(String[] args) {
		Variables T = new Variables();
		T.localVariable();
		T.globalVariable();
		T.staticVariable();
	}

}
