/*
 * The RubberDuck class is the subclass of Birds class
 * and implements the abstract methods of the 
 * super class and has a constructor which in turn 
 * calls the methods in the classes that implement
 * interfaces using a has-a relation.
 */
public class RubberDuck extends Birds {

	public RubberDuck() {
		flyBehavior=new NoFly();
		swimBehavior=new CanSwim();
		beakBehavior=new Flat();
		eggsBehavior=new NoEggs();
	}

	public void description() {
		System.out.println("Description: RubberDuck");

	}

	public void color() {
		System.out.println("Color: Yellow");

	}

	public void sound() {
		System.out.println("Sound: Squeak");

	}

}
