import java.io.*;
import java.util.Scanner;

public class SodaVendingMachine {

	final static int SOLD_OUT=0;
	final static int IDLE=1;
	final static int COIN_COUNT=2;
	final static int ADD_MORE=3;
	final static int DISPENSE_CHANGE=4;
	final static int SELECT_SODA=5;
	final static int DISPENSE_SODA=6;
	
	int state=SOLD_OUT;
	int count;//count is used to count the available number of soda's
	int coin_count;//coin count is used to count the number of coins inserted by customer
	
	
	public SodaVendingMachine()
	{
		state=IDLE;				
		coin_count=0;
	}
	
	public void insertCoins()
	{//insertCoins is used to insert coins into the machine
		if(state==COIN_COUNT)
		{	
			System.out.println("Welcome to Soda Vending Machine\nyou need to add 10 coins to get a soda");
			System.out.println("Please insert coins");
			Scanner scan = new Scanner(System.in);
			coin_count= scan.nextInt();
			System.out.println("Wait for the machine to count");
			System.out.println("you have inserted "+coin_count+" coins");
			if(coin_count<10)
			{
				System.out.println("Not enough Coins");
				notEnoughCoins();
			}else
			{
				state=SELECT_SODA;					
				enoughCoins();
			}				
		}else if(state==IDLE)
		{
				state=COIN_COUNT;
				insertCoins();
		}else if(state==DISPENSE_CHANGE)
		{
				System.out.println("Your order has been cancelled");
				cancelPurchase();
		}else if(state==DISPENSE_SODA)
		{
				System.out.println("Please wait, Your request is being pocessed");
		}else if(state==SOLD_OUT)
		{
				System.out.println("You can't insert coins when the machine is soldout");
		}
		
	}
	
	public void notEnoughCoins()
	{//notEnoughCoins method is used to check whether the coins inserted are enough or not
		if(state==COIN_COUNT)
		{
			if(coin_count<10)
			{
				state=ADD_MORE;
				addCoins();
			}else if (coin_count==10)
			{
				state=SELECT_SODA;
				enoughCoins();
			}
		}else if(state==IDLE)
		{
			System.out.println("Please insert more coins");
		}else if(state==SOLD_OUT)
		{
			System.out.println("OOPS! the machine is out of soda");
			
		}else if(state==DISPENSE_CHANGE)
		{
			System.out.println("Your order has been cancelled");
			cancelPurchase();
		}else if(state==SELECT_SODA)
		{
			System.out.println("Please selct the soda you wish to drink");
		}else if(state==DISPENSE_SODA)
		{
			System.out.println("Plese wait while your request is being processed");
		}
	}
	
	public void addCoins()
	{//addCoins is used to add coins 
		if(state==ADD_MORE)
		{
			if(coin_count<10)
			{
				state=SELECT_SODA;
				System.out.println("Please Insert "+(10-(coin_count))+" more coins");
				Scanner scan = new Scanner(System.in);
				coin_count= coin_count+(scan.nextInt());
				System.out.println("Please wait for the machine to count");
				enoughCoins();
			}else if(coin_count==10)
			{
				state=SELECT_SODA;
				enoughCoins();
			}				
		}else if(state==IDLE)
		{
			System.out.println("You can't add more coins");
		}else if(state==SOLD_OUT)
		{
			System.out.println("Oops! No more soda");
		}else if(state==DISPENSE_CHANGE)
		{
			System.out.println("Your order has been cancelled");
			cancelPurchase();
		}else if(state==SELECT_SODA)
		{
			System.out.println("Please select soda you wish to drink");
		}else if(state==DISPENSE_SODA)
		{
			System.out.println("Please wait while your request is being processed");
		}
	}
	
	public void enoughCoins()
	{//enoughCoins method is used to check whether the person has entered correct number of coins
		if(state==SELECT_SODA)
		{
			System.out.println("Do You want to cancel the purchase?(YES=1 & NO=0)");
			Scanner scan = new Scanner(System.in);
			int input= scan.nextInt();
			if(input==1)
			{
				state=IDLE;
				cancelPurchase();			
			}else
			{
				System.out.println("Please select soda");
				dispense();
			}			
		}else if(state==IDLE)
		{
			System.out.println("Sorry you can't insert coins");
		}else if(state==DISPENSE_SODA)
		{
			System.out.println("Please wait your soda will be dispensed");
		}else if(state==ADD_MORE)
		{
			System.out.println("You cant add coins");
		}else if(state==DISPENSE_CHANGE)
		{
			System.out.println("Please wait your change will be dispensed");
		}else if(state==SOLD_OUT)
		{
			System.out.println("Oops! no soda Please wait your money will be dispensed");
		}
	}
	
	public void cancelPurchase()
	{//cancePurchase is used to cancel the purchase before entering select_soda state
		if(state==SOLD_OUT)
		{
			System.out.println("Please wait your money will be dispensed");
		}else if(state==IDLE)
		{
			System.out.println("Your purchase has been cancelled\n\n");
		}else if(state==COIN_COUNT)
		{
			System.out.println("Please wait your money will be dispensed");
		}else if(state==ADD_MORE)
		{
			System.out.println("Please wait your money will be dispensed");
		}else if(state==DISPENSE_CHANGE)
		{
			System.out.println("Please wait your money will be dispensed");
		}else if(state==SELECT_SODA)
		{
			System.out.println("Sorry, You cant cancel your order at this point");
		}else if(state==DISPENSE_SODA)
		{
			System.out.println("Sorry, You cant cancel your order at this point");
		}return;
	}
	
	public void dispense()
	{//dispense method is used to dispense soda
		if(state==SELECT_SODA)
		{
			if(count>0)
			{
				state=DISPENSE_SODA;
				System.out.println("Please wait, Your soda will be dispensd shortly");
				count=count-1;
				giveChange();
			}else if(count==0)
			{
				System.out.println("Oops! No soda to dispense");
				state=DISPENSE_CHANGE;
				giveChange();
			}
		}else if(state==IDLE)
		{
			System.out.println("You have already inserted, cant insert any more coins");
		}else if(state==COIN_COUNT)
		{
			System.out.println("You have already inserted, cant insert any more coins");
		}else if(state==ADD_MORE)
		{
			System.out.println("You have already inserted, cant insert any more coins");
		}else if(state==DISPENSE_CHANGE)
		{
			System.out.println("Please wait your change will be dispensed");
		}else if(state==SOLD_OUT)
		{
			System.out.println("No soda dispensed");
		}
	}
	
	public void giveChange()
	{//giveChange method dispenses money to the customer
		if(state==DISPENSE_SODA)
		{
			System.out.println("Please collect your soda and change\n\n\n\n");
			state=IDLE;
		}else if(state==IDLE)
		{
			System.out.println("You can't insert coins");
		}else if(state==COIN_COUNT)
		{
			System.out.println("You can't perform this operation");
		}else if(state==ADD_MORE)
		{
			System.out.println("You can't perform this operation");
		}else if(state==DISPENSE_CHANGE)
		{
			System.out.println("Your change will be dispensed");
			if(count>0)
			{
				System.out.println("please collect your change");
				state=IDLE;
			}else if(count==0)
			{
				System.out.println("Please Collect your money back");
				System.out.println("OOPS..! No more soda\n\n\n");
				state=SOLD_OUT;
			}
		}else if(state==SOLD_OUT)
		{
			System.out.println("OOPS..! No more soda");
		}else if(state==SELECT_SODA)
		{
			System.out.println("Please insert coins to select soda");
			state=IDLE;
		}
	}
	
	public static void main(String[] args)
	{//main method
					
		SodaVendingMachine soda= new SodaVendingMachine();
		soda.count=5;
		while(soda.count>0)
		{
			System.out.println(soda);
			soda.insertCoins();
			soda.coin_count=0;
			System.out.println("No.of soda's left"+soda.count);
		}
		soda.insertCoins();
			
		
		
	}
}
