/*
 * Troll is a Character class in the MidievalGame project
 * 
 * 
 * @author	Tyson J. Medlin		
 * @date 09/05/2019
 * 	
 */
package BasicMidievalGame;

public class Troll extends Character {
	//@param name	the name to be used by this character
	public Troll(String name) {
		super(name);
		WeaponBehavior = new WeaponAxe();
		
	}
	//displays this characters display message to console
	public void display() {
		System.out.println(name + " is a funny troll");
	}
	
}