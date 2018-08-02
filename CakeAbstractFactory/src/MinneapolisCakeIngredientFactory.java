
public class MinneapolisCakeIngredientFactory implements CakeIngredientFactory {

	public Dough createDough() {
		// TODO Auto-generated method stub
		return new RegularDough();
	}

	public Cream createCream() {
		// TODO Auto-generated method stub
		return new ChocolateCream();
	}

	public Toppings[] createToppings() {
		// TODO Auto-generated method stub
		Toppings toppings[]={new CherryToppings(),new ChocoChipsToppings(),new StrawberryToppings()};
		return toppings;
	}

	public Flavour[] createFlavour() {
		// TODO Auto-generated method stub
		Flavour  flavour[]={new DarkChocolateFlavour(),new StrawberryFlavour(),new VanillaFlavour(),new PineappleFlavour()};
		return flavour;
	}

	public Chocolate createChocolate() {
		// TODO Auto-generated method stub
		return new DarkChocolate();
	}

	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new SwissCheese();
	}

}
