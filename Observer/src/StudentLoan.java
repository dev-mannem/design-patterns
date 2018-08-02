/*
 * StudentLoan class implements Observer and Display interfaces
 * and implements the methods update and display from these interfaces.
 */
public class StudentLoan implements Observer , Display{
	private float interest;
	private Subject bankLoan;
	public StudentLoan(Subject bankLoan){
		/*
		 * Constructor method registers this observer by calling 
		 * registerObserver method with concrete subject class object.
		 */
		this.bankLoan=bankLoan;
		bankLoan.registerObserver(this);
	}
	public void update(float interest) {
		/*
		 * update method is used to update the changes
		 * in interest and calls display method to display changes.
		 */
		this.interest=interest;
		display();
	}

	public void display() {
		/*
		 * display method is used to display changes.
		 */
		System.out.println("Student loan interest updated to: "+interest);
		
	}
}
