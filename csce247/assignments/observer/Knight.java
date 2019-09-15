/*
 * Knight is an Observer of Watchman in the Observer Design Pattern Assignment
 * 
 * 
 * @author	Tyson J. Medlin		
 * @date 09/15/2019
 * 	
 */
package csce247.assignments.observer;
//Each observer class follows the Watchman as their subject.
public class Knight implements Observer {
	Subject watchman;
	
	//When initialized, this class becomes an observer of Watchman.
	public Knight(Subject watchman)
	{
		this.watchman = watchman;
		watchman.registerObserver(this);
	}
	
	/* Each observer class has two potential messages that change depending on the amount of warnings
	* they receive from their subject, the Watchman.
	* @Param receives a updated value of warning from the subject
	*/
	public void update(int warning)
	{
		if(warning == 1)
			System.out.print("Knight: Helps everyone get home safe\n");
		if(warning == 2)
			System.out.print("Knight: Prepares for battle\n");
	}
}
