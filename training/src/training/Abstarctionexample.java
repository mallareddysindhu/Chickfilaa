package training;

abstract class Abstarction { //this is used for data hiding;we should use abstartc key word;it
//use abstart keyword, abstarct methods are empty, we acnnot crate objecst for abstart class rather we should inherit to another class and then cretae an object
abstract void calculate(double X) ; //This is empty method
}
class Abstraction1 extends Abstarction{ //inhertinh the abstract class
	void calculate(double X) {
		System.out.println("square==" + (X*X));
	}
class Abstraction2 extends Abstarction{
	void calculate(double X) {
		System.out.println("squareroot==" + Math.sqrt(X));
}
}
class Abstarctionexample{
	public void main(String[] args) {
		Abstraction1 A= new Abstraction1();
		A.calculate(10);
	}
}
}