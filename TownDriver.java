/*
 * This is the default distributed driver for the Observer design homework assignment
 * This driver tests all other included classes to ensure basic functionality.
 * @author	Tyson J. Medlin		
 * @version 1.0
 * @date 09/15/2019
 * 	
 */
package csce247.assignments.observer;

public class TownDriver {
	public static void main(String[] args) {
		System.out.println("A Happy Little City");
		
		Watchman watchman = new Watchman();
		Observer fredrick = new ShopOwner(watchman);
		Observer lillian = new Teacher(watchman);
		Observer monte = new Knight(watchman);
		
		System.out.println("\n-----------------------\n");
		
		watchman.issueWarning(1);
		
		System.out.println("\n-----------------------\n");
		
		watchman.issueWarning(2);
	}
}
