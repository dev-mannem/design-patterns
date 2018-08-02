
public class ShoppingCartTestDrive {

		public static void main(String[] args) {
			ShoppingCart cart = new ShoppingCart();

			Item item1 = new Item("1234",20);
			Item item2 = new Item("5678",40);

			cart.addItem(item1);
			cart.addItem(item2);

			//pay by paypal
			cart.pay(new Paypal());
			
			cart.removeItem(item2);
			//pay by credit card
			cart.pay(new CreditCard());
		}

	

}
