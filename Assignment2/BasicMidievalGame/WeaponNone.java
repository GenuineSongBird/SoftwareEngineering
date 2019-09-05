/*
 * WeaponNone is a special case that implements WeaponBehavior 
 * to be used by characters in MidievalGame
 * 
 * @author	Tyson J. Medlin		
 * @date 09/05/2019
 * 	
 */
package BasicMidievalGame;

public class WeaponNone implements WeaponBehavior {
	//displays a message signifying that the current weapon was dropped
	public void attack() {
		System.out.println("Oh no! I lost my weapon");
	}
	
}
