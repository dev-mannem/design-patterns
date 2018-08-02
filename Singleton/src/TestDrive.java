/*
 * TestDrive class contains main method.
 */
public class TestDrive {
	public static void main(String[]args){
		/*
		 * getInstance is a satic method which 
		 * can be called directly with classname.getInstance
		 */
		Baking baking=Baking.getInstance();
		baking.preparecake();
	}
	
}
