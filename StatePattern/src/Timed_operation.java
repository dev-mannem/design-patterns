
public class Timed_operation implements MicrowaveInterface {
	public Timed_operation(Microwave m) 
	{
		
	}

	public void reset()
	{
		System.out.println("Wait until the cooking is completed");
	}
	
	public void poweron()
{
		System.out.println("Cooking started");
	 }
public void timer()
	{
	System.out.println("Already time is set");
	}
public void door_opened()
	{
	System.out.println("Operation disabled, close the door");
	}
public void door_closed()
	{
	System.out.println("Wait!! Already items are inside microwave oven for cooking");
	}
public void start()
    {
	System.out.println("Wait until cooking is complete");
    }
public void time_out()
    {
	System.out.println("Wait for th cooking to complete");
    }
}
