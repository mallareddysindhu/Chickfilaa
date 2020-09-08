package training;

abstract class Add{
	abstract void calculate(double X); //no body will be there
	}
class Add1 extends Add{
	void calculate(double X) { //this abstract method is inherited here
		System.out.println("square==" + (X*X));
	}
}
class Add2 extends Add{
	void calculate(double X) {
		System.out.println("squareroot==" + Math.sqrt(X));
	}
}
public class Addition {
	public static void main(String[] args) {
		Add1 A= new Add1();
		A.calculate(10);
		Add2 AA=new Add2();
		AA.calculate(20);
	}

}
