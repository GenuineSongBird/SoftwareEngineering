/*
 * StrawberryIceCream in the Decorator Design Pattern Assignment sets the first layer of information 
 * (ice cream description, ice cream cost)
 * to fill the abstract base class IceCream.java
 * 
 * 
 * @author	Tyson J. Medlin		
 * @date 09/19/2019
 * 	
 */
package csce247.assignments.decorator;
//StrawberryIceCream is a type of ice cream to supplement information to the abstract base class IceCream
public class StrawberryIceCream extends IceCream{
	//Sets the beginning of the description for the abstract ice cream base class
	public StrawberryIceCream() {
		this.description = "Strawberry Ice Cream";
	}
	//Sets the beginning of the cost for the abstract ice cream base class
	public double getCost() {
		return 0.8;
	}
}
