
import java.io.*;
import java.util.*;

public class Gumballsmachine{
	int gumballs,state;
		public void eject_coin()
		{
		if(state==0)
		{
		state=1;
		}
		else if(state==3)
		{
		System.out.println("No Gumballs in the machine");
		System.out.println("Coin Ejected");
		state=0;
	
		}
		}

		public void insert_coin()
		{
		if(state==0)
		{
		state=1;
		System.out.println("Coin Inserted");
		  if(state==1)
		     {
		      if(gumballs==0)
		         {
		          state=3;
		          eject_coin();
		         }		         
		       else
		         {
		          System.out.println("Crank Turned");
		          turn_crank();
		         }
		     }
		}
	}
		


		public void turn_crank()
		{
		if(state==1)
		  {
		   state=2;
		    if(gumballs>0)
		     dispence();
		  }  
		else
		  {
		  state=3;
		  gumballs=0;
		  System.out.println("No Gumballs in the machine");
		  eject_coin();
		  }
		}

		public void dispence()
		{
		 System.out.println("Gumballs succcessfully dispenced");
		 gumballs-=1;
		 state=0;
		 System.out.println("Number of gumballs left:"+gumballs);
		}
		

	public static void main(String args[])
	{
		Gumballsmachine gs= new Gumballsmachine();
		gs.gumballs=13;
		gs.state=0;
		
		for(;gs.gumballs>0;)
		//while(gs.gumballs>=0)
		{
		gs.insert_coin();
		}
		gs.insert_coin();
		}
	
	}
	