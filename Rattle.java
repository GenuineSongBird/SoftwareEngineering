/*
 * The Rattle class is a type of Toy that overrides the assemble method found in Toy, and sets the Toy name to Rattle.
 *  
 * @author	Tyson J. Medlin		
 * @version 1.0
 * @date 09/19/2019
 * 	
 */
package csce247.assignments.factory;
//The Rattle class is a object of type Toy. The Rattle extends the standards of Toy.
public class Rattle extends Toy{
	//When Rattle is initialized, the name of this Toy is set to Rattle
	public Rattle() {
		name = "Rattle";
	}
	//The Toy-base method assemble is overridden to add the functionality of more printed text-based statements to the user.
	public void assemble() {
		super.assemble();
		System.out.println("Create the frame");
		System.out.println("Add the pebbles");
		System.out.println("Secure the sides");
	}
	
}
