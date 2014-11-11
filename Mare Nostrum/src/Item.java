
public abstract class Item
	{
	protected String name;
	protected int amount;
	protected int volume;
	protected double density;
	protected int localValue;
	
	public void Item(int a, int v, double d, int lv)
		{
		amount = a;
		volume = v;
		density = d;
		localValue = lv;
		}
	}
