/*
 * This is the sub class of Car class which 
 * contains definitions for all the abstract 
 * methods in super class. 
 */
public class FordFiesta extends Car {

	public void brand() {
		/*
		 * This contains the brand of the car.
		 */
		System.out.println("Brand: \t FORD");

	}

	public void model() {
		/*
		 * This contains the model of the car.
		 */
		System.out.println("Model: \t FIESTA");

	}

	public void type() {
		/*
		 * This contains the type of car.
		 */
		System.out.println("Type: \t SEDAN");

	}

	public void price() {
		/*
		 * This method contains the price of the car.
		 */
		System.out.println("Price: \t $5000");

	}

}
