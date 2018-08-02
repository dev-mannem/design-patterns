
public class Cooking_complete implements MicrowaveInterface {
	public Cooking_complete(Microwave m) 
	{
		
	}
	public void reset()
	{
		System.out.println("Cooking completed, place new items for cooking");
	}
	
	public void poweron()
{
		System.out.println("Cooking Completed");
	 }
public void timer()
	{
	System.out.println("Wait to set timer");
	}
public void door_opened()
	{
	System.out.println("Wait to untill the cooking is completed");
	}
public void door_closed()
	{
	System.out.println("Open the door and place new items for cooking");
	}
public void start()
    {
	System.out.println("Wait!! Already cooking is in progress");
    }
public void time_out()
    {
	System.out.println("Cooking completed");
    }
}
