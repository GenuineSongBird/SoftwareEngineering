/*
 * The ToyStore is the class from which toys objects are ordered, "prepared", and returned from.
 * @author	Tyson J. Medlin		
 * @version 1.0
 * @date 09/19/2019
 * 	
 */
package csce247.assignments.factory;

public class ToyStore {
	/*  This method is called to order a type of toy.
	 *  @returns the Toy object
	 * @param type - a String that is the name of the type of toy. (Doll, Rattle, or Car)
	 */
	public Toy orderToy(String type)
	{
		//Toy base is initialized, then type is decided from 'type' string.
		Toy toy;
		if(type.equalsIgnoreCase("Doll"))
		{
			toy = new Doll();
		} else if(type.equalsIgnoreCase("Rattle"))
		{
			toy = new Rattle();
		} else if(type.equalsIgnoreCase("Car"))
		{
			toy = new Car();
		} else return null;
		//Toy is "assembled", "boxed", and "priced", all of which are text based.
		toy.assemble();
		toy.boxToy();
		toy.priceToy();
		//The Toy is returned.
		return toy;
	}
	
}
