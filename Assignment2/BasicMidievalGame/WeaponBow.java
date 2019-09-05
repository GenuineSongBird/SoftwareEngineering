/*
 * WeaponBow is a weapon that implements WeaponBehavior 
 * to be used by characters in MidievalGame
 * 
 * @author	Tyson J. Medlin		
 * @date 09/05/2019
 * 	
 */
package BasicMidievalGame;

public class WeaponBow implements WeaponBehavior {
	//displays a message signifying that an attack was performed with this weapon.
	public void attack() {
		System.out.println("Draw and loose and arrow");
	}
	
}
