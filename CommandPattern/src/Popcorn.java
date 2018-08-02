/*
 * Popcorn class internally calls the popcorn method 
 * using the object reference of MicroWave class.
 */
public class Popcorn implements Order {
	private MicroWave microWave;

	public Popcorn(MicroWave microWave){
		this.microWave=microWave;
		
	}
	public void execute() {
		microWave.popcorn();

	}

}
