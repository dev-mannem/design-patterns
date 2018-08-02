/*
 * This is the testDrive class which has main
 * method. Here we create instance variables 
 * for types of birds and calls different methods 
 * in those classes.
 */
public class BirdTestDrive {

	public static void main(String[] args) {
		Eagle eagle= new Eagle();
		Hen hen= new Hen();
		RubberDuck rubberDuck= new RubberDuck();
		Crow crow= new Crow();
		
		eagle.description();
		eagle.color();
		eagle.sound();
		eagle.performEggs();
		eagle.performBeak();
		eagle.performFly();
		eagle.performSwim();
		
		hen.description();
		hen.color();
		hen.sound();
		hen.performEggs();
		hen.performBeak();
		hen.performFly();
		hen.performSwim();
		
		rubberDuck.description();
		rubberDuck.color();
		rubberDuck.sound();
		rubberDuck.performEggs();
		rubberDuck.performBeak();
		rubberDuck.performFly();
		rubberDuck.performSwim();
		
		crow.description();
		crow.color();
		crow.sound();
		crow.performEggs();
		crow.performBeak();
		crow.performFly();
		crow.performSwim();		

	}

}
