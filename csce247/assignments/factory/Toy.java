/*
 * The abstract Toy class ensures that every toy object shall have a name and the three following methods:
 *  assemble, boxToy, and priceToy.
 *  
 * @author	Tyson J. Medlin		
 * @version 1.0
 * @date 09/19/2019
 * 	
 */
package csce247.assignments.factory;
//The abstract class Toy sets the standard methods that can be overridden by the specific type of toy. Additionally ensures each toy has a name String.
public abstract class Toy {
	protected String name;
	//The Assemble method should be overridden by the specific type of toy, but will announce the type of toy being built beforehand.
	public void assemble()
	{
		System.out.println("Putting together a " + name);	
	}
	//boxToy is text-based and is not expected to be overridden
	public void boxToy()
	{
		System.out.println("Putting the " + name + " in a box");
	}
	//priceToy is text-based and is not expected to be overridden
	public void priceToy()
	{
		System.out.println("Adding price on " + name); 
	}
}
