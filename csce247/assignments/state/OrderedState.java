/*
 * OrderedState is a State that provides appropriate output as to inform of the current state.
 * 
 * @author	Tyson J. Medlin		
 * @date 11/19/2019
 * 	
 */
package csce247.assignments.state;

public class OrderedState implements State{
	private Package pkg;
	/* The constructor of this State sets its given package to the package to be referenced to.
	 * @param a package
	 * @returns none
	 */
	public OrderedState(Package Pkg)
	{
		pkg = Pkg;
	}
	/* displays the most current status of the package.
	 * @param none
	 * @returns none
	 */
	public void displayStatus()
	{
		System.out.println(pkg.getName() + " was ordered");
	}
	/* displays the most current estimated time of arrival of the package.
	 * @param none
	 * @returns none
	 */
	public void displayETA()
	{
		System.out.println(pkg.getName() + " should arrive in 5 to 7 business days");
	}
}
