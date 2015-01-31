
public class objectThingy
{
	private int legs;
	private String name;
	
	public objectThingy(int legs2, String name2)
	{	
		legs = legs2;
		name = name2;
				
	}
		public String getname()
		{
			name = name + " Cuddles King?";
			return name;
		}
		
		public int getx()
		{
			legs = legs + 1;
			return legs;
		}
}