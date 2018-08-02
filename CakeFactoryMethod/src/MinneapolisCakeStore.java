
public class MinneapolisCakeStore extends CakeStore {

	Cake createCake(String item) {
		// TODO Auto-generated method stub
		if(item.equals("strawberry"))
		{
			return new MinneapolisStyleStrawberryCake();
		}else if(item.equals("chocolate"))
		{
			return new MinneapolisStyleChocolateCake();
		}else if(item.equals("pineapple"))
		{
			return new MinneapolisStylePineappleCake();
		}else if(item.equals("vanilla"))
		{
			return new MinneapolisStyleVanillaCake();
		}
		return null;
	}

}
