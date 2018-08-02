/*
 * HondaCRV is a sub class of Car.
 * It implements cost() which is an 
 * abstract method in Super class Car.
 */
 public class HondaCRV extends Car{
	public HondaCRV(){
		/*
		 * This is the constructor method 
		 * which initializes the value 
		 * of description.
		 */
		description="HondaCRV";
	}
	public double cost() {
		/*
		 * cost method returns the cost 
		 * of base model of HondaCRV.
		 */
		return 38000.00;
	}

}
