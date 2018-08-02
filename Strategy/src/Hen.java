/*
 * The Hen class is the subclass of Birds class
 * and implements the abstract methods of the 
 * super class and has a constructor which in turn 
 * calls the methods in the classes that implement
 * interfaces using a has-a relation.
 */
public class Hen extends Birds {

	public Hen() {
		flyBehavior=new NoFly();
		swimBehavior=new CannotSwim();
		beakBehavior=new ShortAndRounded();
		eggsBehavior=new NormalEggs();
	}

	public void description() {
		System.out.println("Description: Hen");

	}

	public void color() {
		System.out.println("Color: Brown");

	}

	public void sound() {
		System.out.println("Sound: cackling");

	}

}
