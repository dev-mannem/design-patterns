/*
 * Car is an Abstract class with
 * two methods, getDescription() 
 * and cost()  
 */
public abstract class Car {
	String description="Unknown Description";
	public String getDescription(){
		return description;
	}
		/*
	 * getDescription() is already implemented
	 * but we need to implement cost() in subclasses 
	 */
	public abstract double cost();

}
