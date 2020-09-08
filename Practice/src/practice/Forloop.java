package practice;

public class Forloop {
	public void triAngle() 
	{
		for (int i = 0; i <=4; i++)
		{
			for (int j = 0; j <=i; j++) 
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public void inTriangle() 
	{
		for (int i = 0; i <=4; i++) 
		{
			for (int j = 4; j >=i; j--) 
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Forloop T= new Forloop();
		T.triAngle();
		T.inTriangle();
		
		}
	}

