/*
 * Pizza class internally calls the pizza method 
 * using the object reference of MicroWave class.
 */
public class Pizza implements Order {
	private MicroWave microWave;
	
	public Pizza(MicroWave microWave){
		this.microWave=microWave;
		
	}

	public void execute() {
		microWave.pizza();

	}

}
