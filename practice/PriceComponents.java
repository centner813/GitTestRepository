package com.yakovfain.practice;

public class PriceComponents {

	double itemCost;
	double shippingWhithinUS;
	double shippingAirParcelToUkraine = 25.00;

public double priceCalcutation () {
	
	return itemCost + shippingWhithinUS;
	
}
public double calcTax () {
	
	if (itemCost <= 200.00 || itemCost == 0) {
		return 0;
	}
	else if (itemCost > 200.00){
		return (itemCost - 200.00) * 0.3;
	}
//	else if (itemCost < 0 || itemCost == -1) {
//		System.out.println("Incorrect value");
//	}
	else {
		System.out.println("WTF?");
	}
	return itemCost;
	
	}
}