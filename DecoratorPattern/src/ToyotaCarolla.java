/*
 * ToyotaCarolla is a sub class of Car.
 * It implements cost() which is an 
 * abstract method in Super class Car.
 */
public class ToyotaCarolla extends Car {
	public ToyotaCarolla(){
		/*
		 * This is the constructor method 
		 * which initializes the value 
		 * of description.
		 */
		description="ToyotaCarolla";
	}

	public double cost() {
		/*
		 * cost method returns the cost 
		 * of base model of ToyotaCarolla.
		 */
		return 35000.00;
	}

}
