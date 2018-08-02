
public class Idle implements MicrowaveInterface{
		public Idle(Microwave m) 
		{
			
		}
	public void reset()
	{
	System.out.println("Turn the power on");
		
	}
	public void poweron()
		 {
		System.out.println("On the power to start using microwave oven");
		 }
	public void timer()
		{
		System.out.println("You have to turn the power on to set time");
		}
	public void door_opened()
		{
		System.out.println("Place items in oven for cooking");
		}
	public void door_closed()
		{
		System.out.println("turn the power on to start cooking");
		}
    public void start()
        {
    	System.out.println("Cooking in process, please wait");
        }
    public void time_out()
        {
    	System.out.println("Turn on power to start microwave oven");
        }

}
