package com.yakovfain.practice;
import java.util.Scanner;

public class FullPrice {

	public static void main(String[] args) {
		
		PriceComponents pc = new PriceComponents ();
		// grab user input using default Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please, enter item value: ");
		
		double itemCost = input.nextDouble();
		System.out.println("How much is domestic US shipping ? ");
		double shippingWhithinUS = input.nextDouble();
		// user input assigned to the variables
		pc.shippingWhithinUS = shippingWhithinUS;
		pc.itemCost = itemCost;
		
		double yourPrice = pc.priceCalcutation();
		System.out.println("Item price is: " + yourPrice);
		
		double yourTax = pc.calcTax();
		System.out.println("Your tax is: " + yourTax);
		System.out.println("Your shipping to Ukraine will be: " + pc.shippingAirParcelToUkraine);
		System.out.println("______________________________________");
		System.out.println(yourPrice + yourTax + pc.shippingAirParcelToUkraine + " USD");
		System.out.println("Total: " + (yourPrice + yourTax + pc.shippingAirParcelToUkraine) * 12 + " UAH");
	}

}
