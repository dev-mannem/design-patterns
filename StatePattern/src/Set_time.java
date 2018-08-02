
public class Set_time implements MicrowaveInterface {
	public Set_time(Microwave m) 
	{
		
	}
	public void reset()
	{
		 System.out.println("On the power to start using microwave oven");
	}
	public void poweron()
		 {
		System.out.println("You cannot on the power again");
		 }
	public void timer()
		{
		System.out.println("You have already on the power");
		}
	public void door_opened()
		{
		System.out.println("Close the door and set time to start cooking");
		}
	public void door_closed()
		{
		System.out.println("Set the timer to start cokking");
		}
    public void start()
        {
    	System.out.println("You have already on the power");
        }
    public void time_out()
        {
    	System.out.println("You have already on the power");
        }
}
