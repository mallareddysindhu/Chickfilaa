package training;

public class Encapsulationexample {
	private String name="Sindhu";
	public int age=28; 
	public void Encapsule() {
		System.out.println("My Name is "+name);
		System.out.println("My age is "+age);
	}
public static void main(String[] args) {
	Encapsulationexample E = new Encapsulationexample();
	E.Encapsule();
}
}
