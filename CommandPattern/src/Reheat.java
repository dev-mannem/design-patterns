/*
 * Reheat class internally calls the reHeat method 
 * using the object reference of MicroWave class.
 */
public class Reheat implements Order {
	private MicroWave microWave;
	
	public Reheat(MicroWave microWave){
		this.microWave=microWave;
		
	}

	public void execute() {
		microWave.reHeat();

	}

}
