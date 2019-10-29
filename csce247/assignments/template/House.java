/*
 * House is an abstract class all its children extend from. 
 * Each child must implement the createFrame() method.
 * the buildHouse method calls all other related methods from this abstract and its children.
 * 
 * @author	Tyson J. Medlin		
 * @date 10/29/2019
 * 	
 */
package csce247.assignments.template;
//Is an abstract class
public abstract class House {
	//Calls all other related methods from this abstract class and its children
	public final void buildHouse()
	{
		prepFoundation();
		createFrame();
		installDrywall();
		addWindows();
		addElectrical();
		addPlumbing();
	}
	//All other methods output text
	public void prepFoundation()
	{
		System.out.println("Foundation: Adding a crawlspace, and a strong backbone.");
	}
	public abstract void createFrame();

	public void installDrywall()
	{
		System.out.println("Drywall: Creating the interior walls.");
	}
	public void addWindows()
	{
		System.out.println("Windows: Putting in the glass for the windows.");
	}
	public void addElectrical()
	{
		System.out.println("Electrical: Running all the wires and hooking up the power.");
	}
	public void addPlumbing()
	{
		System.out.println("Plumbing: Letting water run through the house.");
	}
}
