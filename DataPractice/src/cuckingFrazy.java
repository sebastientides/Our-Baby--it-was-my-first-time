import java.util.Scanner;


public class cuckingFrazy extends DoingStuff{

	public static void main(String[] args)
	{
		dosomeShit();
		System.out.println("I fucking inherited that shit from the DoingStuff class.");
		System.out.println("Now let's see if I can make an object and print it's parameters to the console.");
		buildAnObject();
	}
	public static void buildAnObject()
	{
		System.out.println("How many appendages does your object have? enter a numeral:");
		Scanner intin = new Scanner(System.in);
		int legs = intin.nextInt();
		System.out.println("Your object has " + legs + " appendages?  Very well.");
		System.out.println("What do you call this object?");
		Scanner strin = new Scanner(System.in);
		String name = strin.nextLine();
		System.out.println("You call it a... " + name + "?  That's a funny name.");
		objectThingy yourobject = new objectThingy(legs, name);
		System.out.println("Are you sure that " + yourobject.getname() + " doesn't have " + yourobject.getx() + " appendages?");
	}
}
