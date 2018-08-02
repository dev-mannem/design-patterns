/*
 * The CommandTestDrive class contains the main method.
 */
public class CommandTestDrive {
	public static void main(String[] args) {
	      MicroWave microWave = new MicroWave();

	      Defroast defroast = new Defroast(microWave);
	      Reheat reheat = new Reheat(microWave);
	      Popcorn popcorn=new Popcorn(microWave);
	      Pizza pizza=new Pizza(microWave);
	      Beverage beverage=new Beverage(microWave);

	      UserInterface ui = new UserInterface();
	      ui.takeOrder(defroast);
	      ui.takeOrder(reheat);
	      ui.takeOrder(popcorn);
	      ui.takeOrder(pizza);
	      ui.takeOrder(beverage);

	      ui.placeOrders();
	   }

}
