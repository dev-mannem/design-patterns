/*
 * Defroast class internally calls the defroast method 
 * using the object reference of MicroWave class.
 */
public class Defroast implements Order {
	private MicroWave microWave;

	public Defroast(MicroWave microWave) {
		this.microWave=microWave;
	}

	public void execute() {
		microWave.deFroast();
	}

}
