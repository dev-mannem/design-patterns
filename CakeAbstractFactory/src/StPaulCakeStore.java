
public class StPaulCakeStore extends CakeStore {

	protected Cake createCake(String item) {
		// TODO Auto-generated method stub
		Cake cake=null;
		CakeIngredientFactory ingredientFactory=new StPaulCakeIngredientFactory();
		if(item.equals("strawberry"))
		{
			cake=new StrawberryCake(ingredientFactory);
			cake.setName("St.Paul Style Strawberry Cake");
		}else if(item.equals("chocolate"))
		{
			cake=new ChocolateCake(ingredientFactory);
			cake.setName("St.Paul Style Chocolate Cake");
		}else if(item.equals("pineapple"))
		{
			cake=new PineappleCake(ingredientFactory);
			cake.setName("St.Paul Style Pineapple Cake");
		}else if(item.equals("vanilla"))
		{
			cake=new VanillaCake(ingredientFactory);
			cake.setName("St.Paul Style Vanilla Cake");
		}
		return cake;
	}

}
