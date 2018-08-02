/*
 * TestDrive class in a main 
 * class with main method.
 */
public class TestDrive {

	public static void main(String[] args) {
		/*
		 * main() method creates objects for 
		 * Car and returns cost and description.
		 */
		Car car=new AudiA6();
		System.out.println(car.getDescription() + "\t$" + car.cost());
		Car car1;
		car1 = new BMW320i();
		car1 = new BackUpCamera(car1);
		car1 = new AutoLock(car1);
		System.out.println(car1.getDescription() + "\t$" + car1.cost());
		Car car2;
		car2 = new HondaCRV();
		car2 = new Navigation(car2);
		car2 = new AutomatedAirBagControl(car2);
		System.out.println(car2.getDescription()+"\t$"+car2.cost());
		
		

	}

}
