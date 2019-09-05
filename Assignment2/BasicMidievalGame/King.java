/*
 * King is a Character class in the MidievalGame project
 * 
 * 
 * @author	Tyson J. Medlin		
 * @date 09/05/2019
 * 	
 */
package BasicMidievalGame;

public class King extends Character {
	//@param name	the name to be used by this character
	public King(String name) {
		super(name);
		WeaponBehavior = new WeaponSword();
		
	}
	//displays this characters display message to console
	public void display() {
		System.out.println(name + " is a Noble King");
	}
	
}
