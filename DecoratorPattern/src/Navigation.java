/*
 * Navigation is a subclass of DecoratorPattern.
 * It implements getDescription() and cost() methods.
 */
public class Navigation extends DecoratorPattern {
	Car car;
	public Navigation(Car car){
		/*
		 * the constructor assigns value to the 
		 * object created of type Car.
		 */
		this.car=car;
	}
	public String getDescription() {
		/*
		 * getDescription() returns the description
		 *  of the car with this feature.
		 */
		return car.getDescription() + ", Navigation";
	}
	public double cost() {
		/*
		 * cost method returns the cost 
		 * of the Navigation feature along 
		 * with the cost of the car base model
		 * and additional features.
		 */
		return 130.00 + car.cost();
	}

}
