/*
 * The Crow class is the subclass of Birds class
 * and implements the abstract methods of the 
 * super class and has a constructor which in turn 
 * calls the methods in the classes that implement
 * interfaces using a has-a relation.
 */
public class Crow extends Birds {

	public Crow() {
		flyBehavior=new FlyNormalHeights();
		swimBehavior=new CannotSwim();
		beakBehavior=new Versatile();
		eggsBehavior=new NormalEggs();
	}

	public void description() {
		System.out.println("Description: Crow");

	}

	public void color() {
		System.out.println("Color: Black");

	}

	public void sound() {
		System.out.println("Sound: Caw");

	}

}
