
public class Merchant
	{
	private String name;
	private int currentAge;
	private int experience;
	private int wealth;
	
	public String getName()
		{
		return name;
		}
	public int getCurrentAge()
		{
		return currentAge;
		}
	public int getExperience()
		{
		return experience;
		}
	public int getWealth()
		{
		return wealth;
		}
	public void setName(String n)
		{
		name = n;
		}
	public void setCurrentAge(int ca)
		{
		currentAge = ca;
		}
	public void setExperience(int e)
		{
		experience = e;
		}
	public void setWealth(int w)
		{
		wealth = w;
		}
	@Override
	public String toString()
		{
		return "Merchant name =" + name + "/ncurrentAge = " + currentAge
				+ "/nexperience = " + experience + "/nwealth = " + wealth;
		}
	
	
	}
