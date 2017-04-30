import java.util.Scanner;
public class MyClass{
	
	public static void main(String s[])
	{
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number-");
		
		n = sc.nextInt();
		
		if( n == 0)
		{
			System.out.println("You have entered zero");
		}
		else if (n > 0)
		{
			System.out.println("You have entered a positive number");
		}
		else
		{
			System.out.println("You have entered a negative number");
		}
	}
	
}
