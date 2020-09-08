package training; //This is ifelseif exmaple

public class Ifladderexample {
	public static void main(String[] args) {
		int marks = 20; //int = datatype & marks=variable
		if (marks<50) {
			System.out.println(" D Grade");
		}
		else if (marks<40) {
			System.out.println("Failed");
		}
		else if (marks<=60 && marks>=50) {
			System.out.println(" C grade");
		}
		else if (marks<=70 && marks>=60) {
			System.out.println("B Grade");
		}
		else if (marks<=80 && marks>=70) {
			System.out.println("A Grade");
		}
		else if (marks<=90 && marks>=80) {
			System.out.println("A+ Grade");
		}
		else if (marks<=100 && marks>=90) {
			System.out.println("A++ Grade");
		}
		else { System.out.println("not correct");		
		}
	}

}
