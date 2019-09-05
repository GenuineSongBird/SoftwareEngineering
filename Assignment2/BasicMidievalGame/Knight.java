/*
 * Knight is a Character class in the MidievalGame project
 * 
 * 
 * @author	Tyson J. Medlin		
 * @date 09/05/2019
 * 	
 */
package BasicMidievalGame;

public class Knight extends Character {
	//@param name	the name to be used by this knight
	public Knight(String name) {
		super(name);
		WeaponBehavior = new WeaponBow();
		
	}
	//displays the knights display message to console
	public void display() {
		System.out.println(name + " is a valiant knight");
	}
	
}
