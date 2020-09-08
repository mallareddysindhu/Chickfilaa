package practice;

public class primenumber {
	public static void main(String[] args) {
		int p=13;
		int i;
		int temp=0;
		for(i=2;i<=p-1;i++) {
			if (i%p==0) {
				temp=temp+1;
						}
							}
		if (temp==0) {
			System.out.println("This is a not a Prime Number");
		}
		else {
			System.out.println("This is a prime Number");
		}
	}

}
