/*
 * AudiA6 is a sub class of Car.
 * It implements cost() which is an 
 * abstract method in Super class Car.
 */
public class AudiA6 extends Car {
	public AudiA6(){
		/*
		 * This is the constructor method 
		 * which initializes the value 
		 * of description.
		 */
		description= "AudiA6";
	}

	public double cost() {		
		/*
		 * cost method returns the cost 
		 * of base model of AudiA6.
		 */
		return 40000.00;
	}

}
