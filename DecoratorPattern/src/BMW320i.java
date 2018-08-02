/*
 * BMW320i is a sub class of Car.
 * It implements cost() which is an 
 * abstract method in Super class Car.
 */
public class BMW320i extends Car {
	public BMW320i(){
		/*
		 * This is the constructor method 
		 * which initializes the value 
		 * of description.
		 */
		description="BMW320i";
	}

	public double cost() {
		/*
		 * cost method returns the cost 
		 * of base model of BMW320i.
		 */
		return 42000.00;
	}

}
