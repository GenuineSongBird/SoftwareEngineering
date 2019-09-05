/*
 * WeaponAxe is a axe weapon that implements WeaponBehavior 
 * to be used by characters in MidievalGame
 * 
 * @author	Tyson J. Medlin		
 * @date 09/05/2019
 * 	
 */
package BasicMidievalGame;

public class WeaponAxe implements WeaponBehavior {
	//displays a message signifying that an attack was performed with this weapon.
	public void attack() {
		System.out.println("Swing an axe");
	}
	
}

