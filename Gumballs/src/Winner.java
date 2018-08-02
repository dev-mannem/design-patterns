import java.util.Random;
import java.util.Scanner;



public class Winner {
	final static int NO_QUARTER=0;
	final static int HAS_QUARTER=1;
	final static int SOLD=2;
	final static int SOLD_OUT=3;
	public int state,gumballs;
	int switch_var=0;
	void insert_coin()
	{
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
				System.out.println("invalid input");
				insert_coin();
				break;
			}
		}
		else
			if(state==SOLD_OUT)
			{
				gumballs=0;
				System.out.println("Out of gumballs...!!!");
			}
			else
			{
				state=NO_QUARTER;
				insert_coin();
			}
	}
	
	
	void eject_coin()
	{
		System.out.println("eject_coin() has invoked");
		if(state==HAS_QUARTER)
			state=NO_QUARTER;
		else
		{
			state=SOLD_OUT;
			gumballs=0;
			System.out.println("Out of gumballs...!!!");
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
				System.out.println("Out of gumballs...!!!");
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
	
	void winner()
	{
		if(gumballs>=2)
		{
			gumballs-=2;
			System.out.println("WINNER..!!!!!");
			state=NO_QUARTER;
		}
		else
		{
			state=SOLD_OUT;
			System.out.println("Out of gumballs");
		}
	}
	
	int random()
	{
		Random r=new Random();
		int ri=r.nextInt(10);
		System.out.println("random number"+ri);
		return ri;
	}
	
	public static void main(String[] args)
	{
		Winner w = new Winner();
		w.state=NO_QUARTER;
		w.gumballs=11;
		int num=w.random();
		for(int i=0;i<=10;i++)
		{
			if(i==num)
				w.winner();
			else
				w.insert_coin();
			System.out.println("No of gumballs left:"+w.gumballs);
		}
		w.insert_coin();
	}





}
