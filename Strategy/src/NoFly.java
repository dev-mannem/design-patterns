/*
 * Can NoFly class implements FlyBehavior class
 * and hence defines fly method. As the class name 
 * specifies,birds that cannot-fly has this fly method. 
 */
public class NoFly implements FlyBehavior {

	public void fly() {
		System.out.println("Fly: Cannot Fly");

	}

}
