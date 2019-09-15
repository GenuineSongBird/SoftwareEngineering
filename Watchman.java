/*
 * Watchman is a Subject followed by observers
 * (In other words, observers follow the updates of the Watchman, who is a Subject)
 * in the Observer Design Pattern Assignment
 * 
 * 
 * @author	Tyson J. Medlin		
 * @date 09/15/2019
 * 	
 */
package csce247.assignments.observer;
//ArrayList is the data structure used to list the Observers
import java.util.ArrayList;
//The Watchman class is a Subject that can be followed by observers
public class Watchman implements Subject {
	int warning = 0; //When initialized, warning is 0.
	ArrayList<Observer> observers;
	
	public Watchman() {
		observers = new ArrayList<Observer>();
	}
	/*Observers can be added to the ArrayList
	* @Override
	* @Param an Observer to be registered from list
	*/
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	/*Observers can be removed from the ArrayList
	*@Override
	*@Param an Observer to be removed from list
	*/
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	@Override
	//All currently registered observers can be updated.
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(warning);
		}
	}
	/* Upon a change in warning, observers will be notified and a message
	*  may be displayed.
	*  @Param a value of warning to be changed to.
	*/
	public void issueWarning(int warning) {		this.warning = warning;
		if(warning == 1)
			System.out.println("WARNING: " + warning + " trumpet was played!");
		if(warning ==2)
			System.out.println("WARNING: " + warning + " trumpets were played!");
		notifyObservers();
	}
		
}

