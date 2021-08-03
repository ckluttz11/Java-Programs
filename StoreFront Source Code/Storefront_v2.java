package ist242;

public class Storefront_v2 {
	public static void main(String[] args) {
		Store cheeseStore = new Store("Collin's Cheese Store");
		System.out.println(cheeseStore.getStorename());
		System.out.println(Sale.getTax(100.00, StateCode.PA));
		System.out.println(Sale.getTax(100.00, StateCode.NJ));
		System.out.println(Sale.getDiscount(100.00));
		System.out.println(Sale.getDiscount(100.00, .02));
		Cash cash = new Cash(.10);
		System.out.println(100 + cash.handlePayment(100.00));

		CreditCard card = new CreditCard(.20);
		System.out.println(100 + card.handlePayment(100.00));
		card.setCreditCardExpDate();
		System.out.println("Credit Card Expires On: " + card.getCreditCardExpDate());
		System.out.println(Luhn.Check ("4444333322221111"));

		Product prod = new Product();
		prod.promptUserProduct();
		Product prod2 = new Product();
		prod2.promptUserProduct();
		//System.out.println("Product ID: " + prod.getProductId());
		//System.out.println("Product Name: " + prod.getProductName());
		Products prods = new Products(prod);
		prods.setProducts(prod2, 1);
		prods.printProducts();

		ShoppingCart shop = new ShoppingCart();
		shop.addProductToCart(prod);
		shop.updateProduct(0, prod);
		//shop.removeProduct();
		shop.getNumberOfProducts();
		//shop.emptyCart();
		shop.printProductItems();

		Menu cheeseMenu = new Menu();
		cheeseMenu.addMenuItem("Grilled Cheese");
		cheeseMenu.getMenuItem(0);
		cheeseMenu.updateMenuItem(0, "Grilled Cheese");
		//cheeseMenu.removeMenuItem();
		//cheeseMenu.clearMenuItems();
		cheeseMenu.getNumberMenuItems();
		//cheeseMenu.printMenuItems();
		System.out.print("The Menu is: ");
		cheeseMenu.printSortedMenuItems();
		
		Order doc = new Order();
		doc.createOrderFile();
		doc.writeOrderFile();
		doc.deleteOrderFile();
		

	}
}