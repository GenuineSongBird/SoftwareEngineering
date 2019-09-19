/*
 * This is the default distributed driver for the Decorator design homework assignment
 * This driver tests all other included classes to ensure basic functionality.
 * @author	Tyson J. Medlin		
 * @version 1.0
 * @date 09/19/2019
 * 	
 */
package csce247.assignments.decorator;

public class IceCreamShopDriver {
	public static void main(String[] args) {
		IceCream vanillaIce = new VanillaIceCream();
		vanillaIce = new Sprinkles(vanillaIce);
		vanillaIce = new Cherry(vanillaIce);
		
		IceCream chocIce = new ChocolateIceCream();
		chocIce = new ChocolateChips(chocIce);
		
		System.out.println("******** Ice Cream Shop *******");
		
		System.out.println("I would like to order, 2 Ice Creams:");
		System.out.println(vanillaIce);
		System.out.println(chocIce);
		
		
	}
}
