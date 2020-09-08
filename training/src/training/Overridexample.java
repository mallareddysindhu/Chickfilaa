package training;

class Override {
	public void add(int a,int b) {
		System.out.println(a+b);
	}
}
class Overide1 extends Override{
	public void add(int a,int b) {
		System.out.println(a-b);
	}
}
public class Overridexample{
	public static void main(String[] args) {
	Override O= new Override();
	Overide1 T=new Overide1();
	T.add(10,20);
}
}

