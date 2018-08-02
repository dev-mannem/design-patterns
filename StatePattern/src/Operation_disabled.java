
public class Operation_disabled implements MicrowaveInterface {
	public Operation_disabled(Microwave m) 
	{
		
	}

	public void reset()
	{
		System.out.println("You cannot open the door");
	}
	
	public void poweron()
{
		System.out.println("The Door is opened");
	 }
public void timer()
	{
	System.out.println("Close the door to start cooking");
	}
public void door_opened()
	{
	System.out.println("The door is already open");
	}
public void door_closed()
	{
	System.out.println("Close the door to start cooking");
	}
public void start()
    {
	System.out.println("Close the door to start cooking");
    }
public void time_out()
    {
	System.out.println("The door is already closed");
    }
}
