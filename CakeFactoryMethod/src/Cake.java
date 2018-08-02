import java.util.ArrayList;
public abstract class Cake {
	String name;
	String dough;
	String flavour;
	ArrayList<String>toppings=new ArrayList<String>();
	void prepare()
	{
		System.out.println("Prepare"+name);
		System.out.println("Preparing Dough...");
		System.out.println("Adding Flavour...");
		System.out.println("Adding toppings:");
		for(String topping:toppings)
		{
			System.out.println(""+topping);
		}
	}
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
	String getName()
	{
		return name;
	}
	public String toString()
	{
		StringBuffer display=new StringBuffer();
		display.append("----"+name+"----\n");
		display.append(dough+"\n");
		display.append(flavour+"\n");
		for(String topping:toppings)
		{
			display.append(topping+"\n");
		}
		return display.toString();
	}
}
