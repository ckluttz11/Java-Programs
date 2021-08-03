package ist242;

public class Sale {
	public static double getTax(double saleTotal, StateCode state){
	double total = 0.0;
	if (state == StateCode.PA)
		return .06 * saleTotal;
	else if (state == StateCode.NJ)
		return .06625 * saleTotal;
	return total;
	}
	
	public static double getDiscount(double saleTotal){
		return saleTotal *= .01;
	}

	public static double getDiscount(double saleTotal, double percent){
		return saleTotal *= percent;
	}

}