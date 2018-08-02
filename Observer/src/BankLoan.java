/*
 * java.util.ArrayList is imported 
 * as ArrayList is a predefined
 * class in java.util package.
 */
import java.util.ArrayList;

/*
 * BankLoan is a class which implements Subject interface
 * Hence overrides the methods in Subject interface and
 * also defines other methods like getInterest and setInterest.
 */
public class BankLoan implements Subject {
	private ArrayList observers;    
    private float interest;    

    public BankLoan() {   
    	/*
    	 * This method is a constructor method with 
    	 * no arguments.
    	 */
           observers=new ArrayList();
    }

	public void registerObserver(Observer o) {
		/*
		 * registerObserver method is used to register
		 * observers.
		 */
		observers.add(o);

	}

	public void removeObserver(Observer o) {
		/*
		 * removeObserver method is used to 
		 * remove observers.
		 */
		observers.remove(o);
		System.out.println("Observer removed.");

	}

	public void notifyObservers() {
		/*
		 * notifyObservers method is used to notify all 
		 * the observers about the changes or updates.
		 */
		for (int i=0;i<observers.size();i++) {
            Observer observer=(Observer)observers.get(i);
            observer.update(this.interest);
            }
	}

    public float getInterest() {
    	/*
    	 * getInterest method is used to get the 
    	 * interest value.
    	 */
           return interest;
    }

    public void setInterest(float interest) {
    	/*
    	 * setInterest method is used to set the interest
    	 * value returned by getInterest method.
    	 */
           this.interest = interest;
           notifyObservers();
    }   
}
