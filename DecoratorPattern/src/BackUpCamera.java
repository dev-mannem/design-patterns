/*
 * BackUpCamera is a subclass of DecoratorPattern.
 * It implements getDescription() and cost() methods.
 */
public class BackUpCamera extends DecoratorPattern {
	Car car;
	public BackUpCamera(Car car){
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
		return car.getDescription() + ", BackUpCamera";
	}
	public double cost() {
		/*
		 * cost method returns the cost 
		 * of the BackUpCamera feature along 
		 * with the cost of the car base model
		 * and additional features.
		 */
		return 100.00 + car.cost();
	}

}
