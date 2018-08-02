
public class CakeTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CakeStore mspStore=new MinneapolisCakeStore();
		CakeStore stpStore=new StPaulCakeStore();
		
		Cake cake=mspStore.orderCake("strawberry");
		System.out.println("priyanka ordered a "+cake+"\n");
		cake=stpStore.orderCake("strawberry");
		System.out.println("priya ordered a "+cake+"\n");
		
		cake=mspStore.orderCake("chocolate");
		System.out.println("priyanka ordered a "+cake+"\n");
		cake=stpStore.orderCake("chocolate");
		System.out.println("priya ordered a "+cake+"\n");
		
		cake=mspStore.orderCake("pineapple");
		System.out.println("priyanka ordered a "+cake+"\n");
		cake=stpStore.orderCake("pineapple");
		System.out.println("priya ordered a "+cake+"\n");
		
		cake=mspStore.orderCake("vanilla");
		System.out.println("priyanka ordered a "+cake+"\n");
		cake=stpStore.orderCake("vanilla");
		System.out.println("priya ordered a "+cake+"\n");

	}

}
