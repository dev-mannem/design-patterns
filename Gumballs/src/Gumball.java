import java.util.Scanner;

public class Gumball {
	final static int NO_QUARTER=0;
	final static int HAS_QUARTER=1;
	final static int SOLD=2;
	final static int SOLD_OUT=3;
	public int state,gumballs;
	int switch_var=0;
	void insert_coin()
	{
		System.out.println("");
		if(state==NO_QUARTER)
		{
			state=HAS_QUARTER;
			System.out.println("enter 1.eject  2.turncrank");
			Scanner scan = new Scanner(System.in);
			switch_var= scan.nextInt();
			System.out.println("entered input:"+switch_var);
			switch(switch_var)
			{
			case 1:				
				eject_coin();
				break;
			case 2:				
				turn_crank();
				break;
			default:
				System.out.println("invalid input...!!!");
				insert_coin();
				break;
			}
		}
		else
			if(state==SOLD_OUT)
			{
				gumballs=0;
				System.out.println("No Gumballs...!!");
			}
			else
			{
				state=NO_QUARTER;
				insert_coin();
			}
	}
	
	
	public void eject_coin()
	{
		System.out.println("eject_coin() has invoked");
		if(state==HAS_QUARTER)
			state=NO_QUARTER;
		else
		{
			state=SOLD_OUT;
			gumballs=0;
			System.out.println("No gumballs...!!!");
		}
	}
	
	
	void turn_crank()
	{
		System.out.println("turn_crank() has invoked");
		if(state==HAS_QUARTER)
		{
			state=SOLD;
			if(gumballs>0)
				dispense();
			else
			{
				state=SOLD_OUT;
				gumballs=0;
				System.out.println("No gumballs...!!!");
				eject_coin();
			}
		}
	}
	
	
	void dispense()
	{
			state=NO_QUARTER;
			gumballs-=1;
			System.out.println("Successfuly Dispensed");
	}
	
	
	public static void main(String[] args)
	{
		Gumball gb = new Gumball();
		gb.state=NO_QUARTER;
		gb.gumballs=11;
		System.out.println("No of gumballs left:"+gb.gumballs);
		while(gb.gumballs>0){
			gb.insert_coin();
			System.out.println("No of gumballs left:"+gb.gumballs);
		}
		gb.insert_coin();
	}



}
