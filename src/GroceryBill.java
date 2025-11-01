/* Christopher Cabrera
* September 28, 2025
* CSUGlobal CSC320-1 Programming I
* This program calculates the weekly and monthly average grocery bills based on user input, including coupon adjustments.
*/
import java.util.Scanner;
public class GroceryBill {

	public static void main(String[] args) {
		
		final int WEEKS = 4;
		final int MAX_COUPON = 100;
		final int MIN_COUPON = 0;
		final int DEFAULT_COUPON = 10;
		
		Scanner scnr = new Scanner(System.in);
		
		double coupon;
		double billWeek1;
		double billWeek2;
		double billWeek3;
		double billWeek4;
		double weekAvg;
		double monthlyTotal;
		double weekAvgCoupon;
		double monthlyTotalCoupon;
		
		System.out.println("Enter coupon amount: ");
		coupon = scnr.nextDouble();
		
		if (coupon <= MIN_COUPON || coupon > MAX_COUPON) {
			coupon = DEFAULT_COUPON;
		}
		coupon = coupon / MAX_COUPON;
		
		System.out.println("Enter the total amount you paid for groceries every week: ");
		billWeek1 = scnr.nextDouble();
		billWeek2 = scnr.nextDouble();
		billWeek3 = scnr.nextDouble();
		billWeek4 = scnr.nextDouble();
		
		monthlyTotal = billWeek1 + billWeek2 + billWeek3 + billWeek4;
		
		weekAvg = monthlyTotal / WEEKS;
		
		monthlyTotalCoupon = monthlyTotal - (monthlyTotal * coupon);
		weekAvgCoupon = weekAvg - (weekAvg * coupon);
		
		System.out.printf("Monthly Total you paid: $%.2f\n", monthlyTotal);
		System.out.printf("Weekly Average you paid: $%.2f\n", weekAvg);
		
		System.out.printf("Monthly Total with coupon: $%.2f\n", monthlyTotalCoupon);
		System.out.printf("Weekly Average with coupon: $%.2f\n", weekAvgCoupon);
		
		scnr.close();
	}

}
