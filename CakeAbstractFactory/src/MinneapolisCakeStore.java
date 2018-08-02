
public class MinneapolisCakeStore extends CakeStore {

	protected Cake createCake(String item) {
		// TODO Auto-generated method stub
		Cake cake=null;
		CakeIngredientFactory ingredientFactory=new MinneapolisCakeIngredientFactory();
		if(item.equals("strawberry"))
		{
			cake=new StrawberryCake(ingredientFactory);
			cake.setName("Minneapolis Style Strawberry Cake");
		}else if(item.equals("chocolate"))
		{
			cake=new ChocolateCake(ingredientFactory);
			cake.setName("Minneapolis Style Chocolate Cake");
		}else if(item.equals("pineapple"))
		{
			cake=new PineappleCake(ingredientFactory);
			cake.setName("Minneapolis Style Pineapple Cake");
		}else if(item.equals("vanilla"))
		{
			cake=new VanillaCake(ingredientFactory);
			cake.setName("Minneapolis Style Vanilla Cake");
		}
		return cake;
	}

}
