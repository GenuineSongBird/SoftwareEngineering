/*
 * The Car class is a type of Toy that overrides the assemble method found in Toy, and sets the Toy name to Car.
 *  
 * @author	Tyson J. Medlin		
 * @version 1.0
 * @date 09/19/2019
 * 	
 */
package csce247.assignments.factory;
//The Car class is a object of type Toy. The Car extends the standards of Toy.
public class Car extends Toy{
	//When Car is initialized, the name of this Toy is set to Car
	public Car() {
		name = "Car";
	}
	//The Toy-base method assemble is overridden to add the functionality of more printed text-based statements to the user.
	public void assemble() {
		super.assemble();
		System.out.println("Make the body");
		System.out.println("Add the wheels");
		System.out.println("Paint the car");
	}
	
}
