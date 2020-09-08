package training;
//method over load example
public class Polymorphyexample { //same method name but differnt parameters)
public void add(int a,int b) {
	System.out.println(a+b);
}
public void add(int a,int b,int c) {
	System.out.println(a+b+c);
}
public static void main(String[] args) {
	Polymorphyexample A=new Polymorphyexample();
	A.add(10, 20);
	A.add(10, 20, 30);
		}
}
