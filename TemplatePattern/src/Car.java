/*
 * This is an abstract class with template method
 * and some other abstract methods that are to be 
 * defined in the sub classes. 
 */
public abstract class Car {
	
	public abstract void brand();
	public abstract void model();
	public abstract void type();
	public abstract void price();
	
	public void specifications(){
		/*
		 *This method is the template method that 
		 *all the subclasses can use where as the 
		 *methods called in side this method are to 
		 *be defined in the sub classes. 
		 */
		brand();
		model();
		type();
		price();
	}
	
}
