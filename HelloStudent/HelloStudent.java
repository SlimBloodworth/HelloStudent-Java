import java.util.Scanner;
public class HelloStudent
{
	public static void main (String []args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = keyboard.nextLine();
		System.out.print("\nHello " +name +"!");
		
		
		}
	}