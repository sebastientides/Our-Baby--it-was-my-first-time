import java.util.Scanner;


public class DoingStuff {

	public static void main(String[] args) 
{
		dosomeShit();
}
	public static void dosomeShit()
	{
		int num = takeaNum();
		if (num >= 0 && num <=9)
		{
			System.out.println("You typed: " + num);
		}
		else if (num == 10)
		{
			dosomeShit();
		}
		else if (num == 77)
		{
			luckyNumber();
		}
	}
	private static int takeaNum() 
	{
		System.out.println("Input a number between 0 and 9, or pick 77:");
		Scanner readin = new Scanner(System.in);
		int zto9num = readin.nextInt();
		if (zto9num >= 0 && zto9num <= 9)
		{
			return zto9num;
		}
		else if (zto9num == 77)
		{
			return 77;
		}
		else {
			System.out.println("That is not an integer in the specified bounds.");
			return 10;
		}
	}
	private static void luckyNumber()
	{
		
		for (int x = 0; x<= 77; x++)
		{
			if (x <= 9 && x >= 1)
			{
			System.out.print("0"+ x + " ");
			slowItDown();
			}
			else if (x > 9 && x < 77)
			{
			System.out.print(x + " ");
			slowItDown();
			}
			else if (x == 77)
			{
				System.out.print(x);
				System.out.println(" LUCKY!");
			}
			if (x != 0 && x % 10 == 0)
			{
				System.out.println("");
			}
		}
	}
	public static void slowItDown()
	{
		try
		{
			Thread.sleep(77);                 //77 millisecond pause.
		} 
		catch(InterruptedException ex) 
		{
			Thread.currentThread().interrupt();
		} 
	}
	
}
	

