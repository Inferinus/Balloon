/**
Description:   This is a client application of the Balloon class.
               This class tests the functionality of the Balloon class methods.
     
  Programmer:    Awwal Ahmed
        Date:    September 10, 2021      
    Modified:    September 10, 2021
*/

public class Balloon
{
	private double radius;
	private double volume;
	
	// Constructors
	
	/** 
		Constructs a balloon with a radius of zero.
	*/
	public Balloon ()
	{
		radius = 0;
	}
	
	/**
		Constructs a balloon's radius to an initial value.
		@param initialRadius the initial radius of the balloon
	*/
	public Balloon(double initialRadius)
	{
		radius = initialRadius;
	}
	
	//Methods
	
	/**
		Inflates the balloon
		@param amount the value of inches added to the balloon's radius
	*/
	public void inflate(double amount)
	{
		radius = radius + amount;
	}
	
	/**
		Gets the current volume of the balloon.
		@return the current volume
	*/
	public double getVolume()
	{
		volume = 4.0/3.0 * Math.PI * Math.pow(radius,3);
		return volume;
	}
	
	/**
		Gets the current radius of the balloon.
		@return the current radius.
	*/
	public double getRadius()
	{
		return radius;
	}
}