/*
 * ToppingsDecorator is an abstract class in the Decorator Design Pattern Assignment
 * that sets the description String of the IceCream abstract base class.
 * 
 * @author	Tyson J. Medlin		
 * @date 09/19/2019
 * 	
 */
package csce247.assignments.decorator;
//ToppingsDecorator adds to the description string of the abstract base class IceCream
public abstract class ToppingsDecorator extends IceCream{
	public abstract String toString();
}
