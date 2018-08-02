/*
 * AutomatedAirBagControl is a subclass of DecoratorPattern.
 * It implements getDescription() and cost() methods.
 */
public class AutomatedAirBagControl extends DecoratorPattern {
	Car car;
	public AutomatedAirBagControl(Car car){
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
		return car.getDescription() + ", AutomatedAirBagControl";
	}
	public double cost() {
		/*
		 * cost method returns the cost 
		 * of the AutomatedAirBagControl feature along 
		 * with the cost of the car base model
		 * and additional features.
		 */
		return 150.00 + car.cost();
	}

}
