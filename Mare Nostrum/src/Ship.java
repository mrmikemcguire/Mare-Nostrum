
public abstract class Ship
	{
	protected String name;
	protected int cargoCapacity;
	protected String currentCargo;
	protected int speed;
	protected int dailyOverhead;
	
	public void Ship(int cCap, String cCar, int s, int dov)
		{
		cargoCapacity = cCap;
		currentCargo = cCar;
		speed = s;
		dailyOverhead = dov;
		}
	
	protected abstract void sail();
	protected abstract void load();
	protected abstract void offload();
	}
