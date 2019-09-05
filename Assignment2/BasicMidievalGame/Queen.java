/*
 * Queen is a Character class in the MidievalGame project
 * 
 * 
 * @author	Tyson J. Medlin		
 * @date 09/05/2019
 * 	
 */
package BasicMidievalGame;

public class Queen extends Character {
	//@param name	the name to be used by this character
	public Queen(String name) {
		super(name);
		WeaponBehavior = new WeaponKnife();
		
	}
	//displays this characters display message to console
	public void display() {
		System.out.println(name + " is a beautiful queen");
	}
	
}
