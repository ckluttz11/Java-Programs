package ist242;

public class Storefront {
	static String storename;
	public static void main(String[] args){
		storename = args[0];
		storename += " " + args[1];
		storename += " " + args[2];
		System.out.println("Welcome to " + storename);
	}
}