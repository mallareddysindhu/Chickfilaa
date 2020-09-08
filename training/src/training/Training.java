package training;

public class Training {
	public static void firstProgram() {
		System.out.println("This is my first output");
	}
	public  void secondProgram() {
		System.out.println("This output should be displayed");
	}
	public static void main(String[] args) {
		Training T = new Training();
		//T.firstProgram();
		T.secondProgram();
		Training.firstProgram();
		//Training.secondProgram();
	}
}
