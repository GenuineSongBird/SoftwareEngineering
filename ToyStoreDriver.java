/*
 * This is the default distributed driver for the Factory Design Pattern Assignment
 * This driver tests all other included project classes to ensure accurate functionality.
 * 
 * @author	Tyson J. Medlin		
 * @version 1.0
 * @date 09/24/2019
 * 	
 */
package csce247.assignments.factory;

public class ToyStoreDriver {
	
	public static void main(String[] args) {
		ToyStore specialToys = new ToyStore();
		
		Toy msThing  = specialToys.orderToy("doll");
		
		System.out.println("\n---------------------\n");
		
		Toy raceCar = specialToys.orderToy("car");
		
		System.out.println("\n---------------------\n");
		
		Toy funnySounder = specialToys.orderToy("rattle");
	}
}
