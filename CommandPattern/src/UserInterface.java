/*
 * The UserInterface class takes the order 
 * from user and places those orders.
 */

import java.util.ArrayList;
import java.util.List;


public class UserInterface {
	private List<Order> orderList = new ArrayList<Order>();

	public void takeOrder(Order order){
		orderList.add(order);		
	}

	public void placeOrders(){

		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}

}
