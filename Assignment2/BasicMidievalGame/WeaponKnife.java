/*
 * WeaponKnife is a weapon that implements WeaponBehavior 
 * to be used by characters in MidievalGame
 * 
 * @author	Tyson J. Medlin		
 * @date 09/05/2019
 * 	
 */
package BasicMidievalGame;

public class WeaponKnife implements WeaponBehavior {
	//displays a message signifying that an attack was performed with this weapon.
	public void attack() {
		System.out.println("Slice with knife");
	}
	
}
