
public class StrawberryCake extends Cake {
	CakeIngredientFactory ingredientFactory;

	public StrawberryCake(CakeIngredientFactory ingredientFactory) {
		// TODO Auto-generated constructor stub
		this.ingredientFactory=ingredientFactory;
	}

	void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing"+name);
		dough=ingredientFactory.createDough();
		toppings=ingredientFactory.createToppings();
		cream=ingredientFactory.createCream();
		flavour=ingredientFactory.createFlavour();
		}

}
