
public class Operation_enabled implements MicrowaveInterface {
	public Operation_enabled(Microwave m) 
	{
		
	}

	public void reset()
	{
		System.out.println("The Door is already closed");
	}
	
	public void poweron()
{
		System.out.println("The Door is closed");
	 }
public void timer()
	{
	System.out.println("Wait untill cooking is completed to set time");
	}
public void door_opened()
	{
	System.out.println("You cannot open the door now");
	}
public void door_closed()
	{
	System.out.println("Wait until cooking is completed ");
	}
public void start()
    {
	System.out.println("You have already closed the door");
    }
public void time_out()
    {
	System.out.println("You cannot close the door again");
    }
}
