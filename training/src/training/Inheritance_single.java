package training;

class A{
	public void print(){
		int i=1;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
			}
		}
class B extends A{
	public void rePrint() {
		int i=10;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
	}
}
class C extends B{
	public void book() {
		int i=1;
		while(i<=10) {
			if (i==5) {
				continue;
				    	}
			System.out.println(i);
			i++;
		}
	}
}
public class Inheritance_single {
	public static void main(String[] args) {
		//B Bobject=new B();
		//Bobject.print();
		//Bobject.rePrint();
		C CC = new C();
		CC.print();
		CC.rePrint();
		CC.book();
		
	}
}
