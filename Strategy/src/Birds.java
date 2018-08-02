/*
 * Birds is an abstract class with three abstract methods
 * that are commonly implemented in all the subclasses. 
 * The other eight methods are for the features that 
 * are not common for all kinds of birds. 
 */
public abstract class Birds {
	FlyBehavior flyBehavior;
	SwimBehavior swimBehavior;
	BeakBehavior beakBehavior;
	EggsBehavior eggsBehavior;
	public abstract void description();
	public abstract void color();
	public abstract void sound();
	public void setFlyBehavior(FlyBehavior fb)
	{
		/*
		 * This method is used to set the fly 
		 * Behavior of each kind of bird
		 */
		this.flyBehavior=fb;
	}
	public void setSwimBehavior(SwimBehavior sb)
	{
		/*
		 * This method is used to set the swim 
		 * Behavior of each kind of bird
		 */
		this.swimBehavior=sb;
	}
	public void setBeakBehavior(BeakBehavior bb)
	{
		/*
		 * This method is used to set the beak 
		 * Behavior of each kind of bird
		 */
		this.beakBehavior=bb;
	}
	public void setEggsBehavior(EggsBehavior eb)
	{
		/*
		 * This method is used to set the eggs 
		 * Behavior of each kind of bird
		 */
		this.eggsBehavior=eb;
	}
	public void performFly()
	{
		/*
		 * This method is used to perform the fly 
		 * Behavior of each kind of bird
		 */
		flyBehavior.fly();
	}
	public void performSwim()
	{
		/*
		 * This method is used to perform the swim 
		 * Behavior of each kind of bird
		 */
		swimBehavior.swim();
	}
	public void performBeak()
	{
		/*
		 * This method is used to perform the beak 
		 * Behavior of each kind of bird
		 */
		beakBehavior.beak();
	}
	public void performEggs()
	{
		/*
		 * This method is used to know the type of eggs 
		 * Behavior of each kind of bird
		 */
		eggsBehavior.eggs();
	}

}
