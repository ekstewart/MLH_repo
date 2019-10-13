import java.util.Scanner;
public class FileThatDoesNothing
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value to yeet: ");
		int input = scan.nextInt();
		recursiveYeet(input);
	}
	public static int recursiveYeet(int n)
	{
		if(n<=1)
		{
			return 0;
		}
		else
		{
			System.out.println("Yeet");
			return(n-1);
		}
		
		
	}
}
