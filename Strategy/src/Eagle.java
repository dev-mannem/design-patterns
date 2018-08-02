/*
 * The Eagle class is the subclass of Birds class
 * and implements the abstract methods of the 
 * super class and has a constructor which in turn 
 * calls the methods in the classes that implement
 * interfaces using a has-a relation.
 */
public class Eagle extends Birds {

	public Eagle()
	{
		flyBehavior=new FlyHeights();
		swimBehavior=new CanSwim();
		beakBehavior=new Hooked();
		eggsBehavior=new BigEggs();
	}
	public void description() {
		System.out.println("Description: Eagle");
		
	}
	public void color() {
		System.out.println("Color: Brown");

	}

	public void sound() {
		System.out.println("Sound: Eagle sound");

	}

	

}
