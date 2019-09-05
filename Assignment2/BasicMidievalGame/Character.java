/*
 * Character is an abstract class in the MidievalGame project
 * that all other characters extend.
 * 
 * @author	Tyson J. Medlin		
 * @date 09/05/2019
 * 	
 */
package BasicMidievalGame;

//Each character has a name, an attack, and a display method
public abstract class Character {
	protected String name;
	WeaponBehavior WeaponBehavior;
	//@param name	name to be used by a character
	public Character(String name) {
		this.name = name;
	}
	//attack is defined per character by the weapon used by said character
	public void attack() {
		WeaponBehavior.attack();
	}
	//display message is implemented by each character directly
	public abstract void display();
	
	//WeaponBehavior can be set by this method
	public void setWeaponBehavior(WeaponBehavior wb) {
		WeaponBehavior = wb;
	}
		
	
}
