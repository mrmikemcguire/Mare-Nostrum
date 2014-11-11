
public abstract class Port
	{
	protected String name;
	protected String location;
	protected String wares;
	protected double busynessRating;
	
	public void Port(String w, double br)
		{
		wares = w;
		busynessRating = br;
		}
	}
