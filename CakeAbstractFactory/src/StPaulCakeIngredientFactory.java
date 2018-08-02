
public class StPaulCakeIngredientFactory implements CakeIngredientFactory {

	public Dough createDough() {
		// TODO Auto-generated method stub
		return new LargeDough();
	}

	public Cream createCream() {
		// TODO Auto-generated method stub
		return new VanillaCream();
	}

	public Toppings[] createToppings() {
		// TODO Auto-generated method stub
		Toppings toppings[]={new CherryToppings(),new ChocoChipsToppings(),new StrawberryToppings()};
		return toppings;
	}

	public Flavour[] createFlavour() {
		// TODO Auto-generated method stub
		Flavour flavour[]={new MilkChocolateFlavour(),new StrawberryFlavour(),new VanillaFlavour(),new PineappleFlavour()};
		return flavour;
	}

	public Chocolate createChocolate() {
		// TODO Auto-generated method stub
		return new MilkChocolate();
	}

	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new RussianCheese();
	}

}
