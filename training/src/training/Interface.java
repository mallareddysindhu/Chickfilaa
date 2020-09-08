package training;

interface I1{ //iterface is similar to class;instance of a class.
	void method1();
	void method2();
}
class I2 implements I1{ //should call methods defuined in Interface key word class
	public void method1() {
		int X=10;
		System.out.println("ADD==" + (X+X));
		}
	public void method2() {
		int X=10;
		System.out.println("MUL==" + (X*X));
}
}
class I3 implements I1{
	public void method1() {
		int X=10;
		System.out.println("ADD==" + (X+X));
		}
	public void method2() {
		int X=10;
		System.out.println("MUL==" + (X*X));
	}
}
public class Interface {
public static void main(String[] args) {
	I2 A= new I2();
	I3 B= new I3();
	A.method1();
	A.method2();
	B.method1();
	B.method2();
}
}
