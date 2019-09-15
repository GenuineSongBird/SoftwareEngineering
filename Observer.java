/*
 * Observer is a interface followed by observers
 * (In other words, classes that stay informed to the Watchman)
 * in the Observer Design Pattern Assignment
 * 
 * 
 * @author	Tyson J. Medlin		
 * @date 09/15/2019
 * 	
 */
package csce247.assignments.observer;
/* Each Observer much have a update methods that, in the context of this program,
 * updates their value of the warning integer to the most recent value of the warning integer.
*/
public interface Observer {
	public void update(int warning);
}
