
public class StPaulCakeStore extends CakeStore {

	Cake createCake(String item) {
		// TODO Auto-generated method stub
		if(item.equals("strawberry"))
		{
			return new StPaulStyleStrawberryCake();
		}else if(item.equals("chocolate"))
		{
			return new StPaulStyleChocolateCake();
		}else if(item.equals("pineapple"))
		{
			return new StPaulStylePineappleCake();
		}else if(item.equals("vanilla"))
		{
			return new StPaulStyleVanillaCake();
		}
		return null;
		
	}

}
