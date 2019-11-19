/*
 * Package can change it state to change its method's actions accordingly.
 * 
 * @author	Tyson J. Medlin		
 * @date 11/19/2019
 * 	
 */
package csce247.assignments.state;
/* Package can change its state, contains a name, and has a current state.
 * 
 */
public class Package {
	private State orderedState;
	private State inTransitState;
	private State deliveredState;
	private State state;
	private String name = "";
	/* The constructor for a Package object.
	 * @param contents
	 * @returns none
	 */
	public Package(String contents)
	{
		orderedState = new OrderedState(this);
		inTransitState = new InTransitState(this);
		deliveredState = new DeliveredState(this);
		name = contents;
	}
	/* order changes state of the package accordingly, and displays most modern info.
	 * @param none
	 * @returns none
	 */
	public void order()
	{
		state = orderedState;
		state.displayStatus();
		state.displayETA();
	}
	/* mail changes state of the package accordingly, and displays most modern info.
	 * @param none
	 * @returns none
	 */
	public void mail()
	{
		state = inTransitState;
		state.displayStatus();
		state.displayETA();
	}
	/* received changes state of the package accordingly, and displays most modern info.
	 * @param none
	 * @returns none
	 */
	public void received()
	{
		state = deliveredState;
		state.displayStatus();
	}
	/* changes the current state of the package to the given state.
	 * @param a state to set the current state of the package as.
	 * @returns none
	 */
	public void setState(State state)
	{
		this.state = state;
	}
	/* returns the name of the package
	 * @param none
	 * @returns the name of the package
	 */
	public String getName()
	{
		return name;
	}
}
