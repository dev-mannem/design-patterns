/*
 * BankLoanTest class is used to test weather the
 * updates are working properly or not. It contains 
 * the main method.
 */
public class BankLoanTest {
	public static void main(String args[]) {   
		BankLoan loan = new BankLoan();
        BankLoan loan1 = new BankLoan();
        StudentLoan studentLoan = new StudentLoan(loan);
        HouseLoan houseLoan = new HouseLoan(loan1);        
        loan.setInterest(3.5f);
        loan1.setInterest(4.0f);
        loan1.removeObserver(houseLoan);
        loan1.setInterest(5.0f);
        loan.setInterest(5.0f);
	}
}
