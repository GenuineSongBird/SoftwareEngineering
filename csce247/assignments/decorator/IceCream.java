/*
 * IceCream is an abstract base class in the Decorator Design Pattern Assignment
 * that contains attributes descending types of ice cream shall fill.
 * 
 * @author	Tyson J. Medlin		
 * @date 09/19/2019
 * 	
 */
package csce247.assignments.decorator;
//Description of IceCream above
public abstract class IceCream {
	//Each class that supplements the IceCream base abstract class will add to the description
	protected String description;
	/* When the class that supplements the IceCream base abstract class is called,
	*  in the context of a string, the description string will be printed.
	*/
	public String toString()
	{
		return description;
	}
	/* When the getCost method is called to a class that supplements the IceCream base class
	*  the calculated cost of all descending decorator classes will be printed.
	*/
	public abstract double getCost();
	
}
