/*
 * ChocolateChips adds on to any previously set information 
 * (previously set ice cream description + "X", previously set ice cream cost + "X")
 * ("X" being some describing attribute of this class)
 * to fill the abstract base class IceCream.java
 * 
 * @author	Tyson J. Medlin		
 * @date 09/19/2019
 * 	
 */
package csce247.assignments.decorator;
//Cherry is an optional information decoration for IceCream
public class Cherry extends ToppingsDecorator{
	IceCream iceCream;
	/*	@param  An available flavor of ice cream
	 *  Initializes Cherry to supplement information to IceCream
	*/
	public Cherry(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	//Adds information to the IceCream description
	public String toString() {
		return iceCream.toString() + " + cherry";
	}
	//Adds an additional cost to the already existing cost set previously by initialization
	public double getCost() {
		return iceCream .getCost() + 0.4;
	}
}
