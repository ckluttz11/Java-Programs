package ist242;

public interface Cart{

public void addProductToCart(Product prod);
public void updateProduct(int prodIndex, Product prod);
public void removeProduct(int prodIndex);
public int getNumberOfProducts();
public void emptyCart();
public void printProductItems();

}