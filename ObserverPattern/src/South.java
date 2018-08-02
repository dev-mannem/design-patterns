/*
 * South class implements Observer and DisplayElement interfaces
 * and implements the methods update and display from these interfaces.
 */
public class South implements Observer, DisplayElement {
	private boolean red;
	private boolean yellow;
	private boolean green;
	private Subject trafficSignals;
	
	public South(Subject trafficSignals){
		/*
		 * Constructor method registers this observer by calling 
		 * registerObserver method with concrete subject class object.
		 */
		this.trafficSignals=trafficSignals;
		trafficSignals.registerObserver(this);
	}

	public void display() {
		/*
		 * display method is used to display changes.
		 */
		System.out.println("SOUTH:");
		if(red==true){
			System.out.println("\tRED: ON\t\t STOP");
		}
		else{
			System.out.println("\tRED: OFF");
		}
		if(yellow==true){
			System.out.println("\tYELLOW: ON\t SLOW DOWN");
		}
		else{
			System.out.println("\tYELLOW: OFF");
		}
		if(green==true){
			System.out.println("\tGREEN: ON\t GO");
		}
		else{
			System.out.println("\tGREEN: OFF");
		}		
	}

	public void update(boolean red, boolean yellow, boolean green) {
		/*
		 * update method is used to update the changes
		 * in red,yellow and green values and calls display method to display changes.
		 */
		this.red=red;
		this.yellow=yellow;
		this.green=green;
		display();
	}
}
