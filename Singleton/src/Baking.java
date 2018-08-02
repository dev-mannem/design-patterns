/*
 * Baking is a singleton class with getInstance static method
 * and private constructor.
 */
public class Baking {
	private static Baking uniqueInstance;
	
	private Baking(){
		
	}	
	public static synchronized Baking getInstance(){
		if(uniqueInstance==null){
			uniqueInstance=new Baking();
		}
		return uniqueInstance;
	}
	public void preparecake(){
		System.out.println("Cake preparing steps:");
		dough();
		bake();
		cut();
		serve();
	}
	public void dough(){
		 System.out.println("Preparing Dough");
	}
	public void bake(){
		System.out.println("Bake for 40 minutes");
	}
	public void cut(){
		System.out.println("Cutting cake");
	}
	public void serve(){
		System.out.println("Serve the cake");
	}

}
