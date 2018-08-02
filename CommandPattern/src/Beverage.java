/*
 * Beverage class internally calls the beverage method 
 * using the object reference of MicroWave class.
 */
public class Beverage implements Order {
	private MicroWave microWave;
	
	public Beverage(MicroWave microWave){
		this.microWave=microWave;
		
	}

	public void execute() {
		microWave.beverage();

	}

}
