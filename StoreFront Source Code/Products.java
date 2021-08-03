package ist242;

public class Products{

private Product[] products = new Product[10];

public Products(Product prod){
products[0] = prod;
}

public void printProducts(){
	for(Product prod : products){
		if(prod != null){
			System.out.println("Product Id: " + prod.getProductId());
			System.out.println("Product Name: " + prod.getProductName());
			}
		}
	}

public void setProducts(Product prod, int slot){
	products[slot] = prod;
	}

public Product getProducts(int slot){
	return products[slot];
	}

}