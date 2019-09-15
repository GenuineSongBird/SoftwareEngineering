/*
 * Subject is a interface followed by the Watchman
 * (In other words, the Watchman is subject of the observers)
 * in the Observer Design Pattern Assignment
 * 
 * 
 * @author	Tyson J. Medlin		
 * @date 09/15/2019
 * 	
 */
package csce247.assignments.observer;
/* All subjects must be able to register new observers, remove already registered observers, and
 * notify current observers upon update.
 */
public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
