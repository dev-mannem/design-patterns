/*
 * This is the test drive class which 
 * contains the main method.
 */
public class TemplateTestDrive {

	public static void main(String[] args) {
		/*
		 * here we are creating two objects one 
		 * for each sub class. And using these 
		 * objects we are calling the specifications 
		 * template method to implement the template pattern.
		 */
		Bmw320i bmw=new Bmw320i();
		FordFiesta ff=new FordFiesta();
		System.out.println("Specifications of Ford Fiesta");
		ff.specifications();
		System.out.println("");
		System.out.println("Specifications of BMW");
		bmw.specifications();

	}

}
