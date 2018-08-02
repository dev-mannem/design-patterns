
public abstract class Cake {
	String name;
	Dough dough;
	Cream cream;
	Toppings toppings[];
	Flavour flavour[];
	Chocolate chocolate;
	Cheese cheese;
	abstract void prepare();
	void bake()
	{
		System.out.println("Bake for 40 minutes at 350");
	}
	void greeting()
	{
		System.out.println("Customized Greeting");
	}
	void box()
	{
		System.out.println("Place cake in cake box");
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	public String toString()
	{
		StringBuffer result=new StringBuffer();
		result.append("----"+name+"----\n");
		if(dough!=null)
		{
			result.append(dough);
			result.append("\n");
		}
		if(cream!=null)
		{
			result.append(cream);
			result.append("\n");
		}
		if(toppings!=null)
		{
			for(int i=0;i<toppings.length;i++)
			{
				result.append(toppings[i]);
				if(i<toppings.length-1)
				{
					result.append(",");
				}
			}			
			result.append("\n");
		}
		if(flavour!=null)
		{
			for(int i=0;i<flavour.length;i++)
			{
				result.append(flavour[i]);
				if(i<flavour.length-1)
				{
					result.append(",");
				}
			}			
			result.append("\n");
		}
		if(chocolate!=null)
		{
			result.append(chocolate);
			result.append("\n");
		}
		if(cheese!=null)
		{
			result.append(cheese);
			result.append("\n");
		}
		return result.toString();
	}

}
