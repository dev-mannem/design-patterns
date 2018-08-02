
public abstract class CakeStore {
	protected abstract Cake createCake(String item);
	public Cake orderCake(String type)
	{
		Cake cake=createCake(type);
		System.out.println("---Making a "+cake.getName()+"---");
		cake.prepare();
		cake.bake();
		cake.greeting();
		cake.box();
		return cake;
	}

}
