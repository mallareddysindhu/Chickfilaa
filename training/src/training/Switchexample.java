package training;

public class Switchexample {
	public static void main(String[] args) {
		int N =10;
		switch (N) {  // this is like elseif condition
		case 10:
        System.out.println("10"); 
        break;
		case 20:
		System.out.println("20");
		break;
		case 30:
		System.out.println("30");
		break;
		case 40:
		System.out.println("40");
		break;
		default:
		System.out.println("Not in 10,20,30,40");
		break;
		}
	}

}
