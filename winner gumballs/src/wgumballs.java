import java.io.*;
import java.util.*;


public class wgumballs {
	int gumballs,state;
		public void eject_coin()
		{
		if(state==0)
		{
		state=1;
		}
		else if(state==3)
		{
		System.out.println("No Gumballs");
		state=0;
		}
		}

		public void insert_coin()
		{
		if(state==0)
		{
		state=1;
		System.out.println("Coin Inserted");
            /*  int START = 1;
            int END = 13;
            Random random = new Random();
    for (int idx = 1; idx <= 13; ++idx){
      showRandomInteger(START, END, random); }*/

Random rn = new Random();
int randomInt = rn.nextInt(13) + 1;
    
                  if(state==1)
                    {
		  if(gumballs!=randomInt)
		  {
			  System.out.println("you are not a winner");
               	      if(gumballs==0)
		         {
		          state=3;
		          eject_coin();
		         }
		       else
		         {
		          System.out.println("Crank Turned");
		          state=2;
		          turn_crank();
		        }
		     }
		    else
		    {
		    	System.out.println("random number generated is:" +randomInt);
		    	iswinner();
		    }
                       
                      }
}
}



/* private static void showRandomInteger(int aStart, int aEnd, Random aRandom){
    if (aStart > aEnd) {
      throw new IllegalArgumentException("Start cannot exceed End.");
    }
    
    long range = (long)aEnd - (long)aStart + 1;
    
    long fraction = (long)(range * aRandom.nextDouble());
    int randomNumber =  (int)(fraction + aStart);    
    log("Generated : " + randomNumber);
  }
*/




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
		}

             public void iswinner()
             {
             System.out.println("You are a winner");
             state=4;
             if(gumballs>0)
             {
              state=0;
              gumballs=gumballs-2;
              }
             if(gumballs==0)
              {
               System.out.println("No gumballs");
		       state=3;
		       eject_coin();
               }
             }



	public static void main(String args[])
	{
		wgumballs gs= new wgumballs();
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
	

